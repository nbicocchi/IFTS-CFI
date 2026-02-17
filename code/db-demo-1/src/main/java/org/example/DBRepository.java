package org.example;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
        return new ArrayList<>();

    }

    public Car save(Car entity) {
        return null;

    }

    private Car insert(Car car) {
        return null;

    }

    public void delete(Car entity) {

    }

    public void deleteById(Long id) {

    }

    public void deleteAll() {

    }

}
