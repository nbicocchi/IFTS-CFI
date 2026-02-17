package org.example;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class DBRepository implements Repository<Car, Long> {
    private static final String JDBC_Driver = "org.sqlite.JDBC";
    private static final String JDBC_URL = "jdbc:sqlite:jdbc_schema.db";
    HikariDataSource dataSource;

    public DBRepository() {
        dataSource = initDataSource(JDBC_Driver, JDBC_URL);
        checkTable();
    }

    private HikariDataSource initDataSource(String JDBC_Driver, String JDBC_URL) {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(JDBC_Driver);
        config.setJdbcUrl(JDBC_URL);
        config.setLeakDetectionThreshold(2000);
        return new HikariDataSource(config);
    }

    private void checkTable() {
        System.out.printf("Checking if table exists in database.%n");
        String sql = "SELECT * FROM cars LIMIT 1";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
        } catch (SQLException e) {
            // Must be disabled in production!
            initTable();
        }
    }

    private void initTable() {
        System.out.println("Creating tables in database...");

        String dropTable = "DROP TABLE IF EXISTS cars";
        String createTable = "CREATE TABLE cars (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +  // SERIAL non esiste in SQLite
                "brand TEXT DEFAULT NULL, " +
                "model TEXT DEFAULT NULL)";

        String insert1 = "INSERT INTO cars (brand, model) VALUES ('Toyota', 'Corolla')";
        String insert2 = "INSERT INTO cars (brand, model) VALUES ('Honda', 'Civic')";
        String insert3 = "INSERT INTO cars (brand, model) VALUES ('Ford', 'Mustang')";

        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement()) {

            // Creazione tabella
            statement.executeUpdate(dropTable);
            statement.executeUpdate(createTable);

            // Inserimento dati di esempio
            statement.executeUpdate(insert1);
            statement.executeUpdate(insert2);
            statement.executeUpdate(insert3);

            System.out.println("Table created and sample data inserted!");

        } catch (SQLException e) {
            System.out.println("Error creating table or inserting data.");
            throw new RuntimeException(e.getMessage(), e);
        }
    }


    @Override
    public Optional<Car> findById(Long Id) {
        String sql = "SELECT * FROM cars WHERE id=?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, Id);
            ResultSet rs = statement.executeQuery();

            if (!rs.next()) {
                return Optional.empty();
            }

            return Optional.of(new Car(rs.getLong("id"),
                    rs.getString("brand"),
                    rs.getString("model")));
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Iterable<Car> findAll() {
        String sql = "SELECT * FROM cars";
        List<Car> cars = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                cars.add(new Car(rs.getLong("id"),
                        rs.getString("brand"),
                        rs.getString("model")));
            }
            return cars;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    @Override
    public Car save(Car entity) {
        if (Objects.isNull(entity.id)) {
            return insert(entity);
        }

        Optional<Car> car = findById(entity.id);
        if (car.isEmpty()) {
            return insert(entity);
        } else {
            return update(entity);
        }
    }

    private Car insert(Car entity) {
        String sql = "INSERT INTO cars (brand, model) VALUES (?, ?)";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, entity.brand);
            statement.setString(2, entity.model);
            statement.executeUpdate();
            try (ResultSet keys = statement.getGeneratedKeys()) {
                keys.next();
                entity.id = keys.getLong(1);
                return entity;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private Car update(Car entity) {
        String sql = "UPDATE cars SET brand=?, model=? WHERE id=?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, entity.brand);
            statement.setString(2, entity.model);
            statement.setLong(3, entity.id);
            statement.executeUpdate();
            return entity;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void delete(Car entity) {
        deleteById(entity.id);
    }

    @Override
    public void deleteById(Long id) {
        String sql = "DELETE FROM cars WHERE id=?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteAll() {
        String sql = "DELETE FROM cars";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
