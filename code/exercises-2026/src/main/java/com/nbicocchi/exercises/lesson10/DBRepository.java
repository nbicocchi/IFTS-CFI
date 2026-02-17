package com.nbicocchi.exercises.lesson10;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DBRepository implements Repository<Car, Long> {
    private static final String JDBC_Driver = "org.sqlite.JDBC";
    private static final String JDBC_URL = "jdbc:sqlite:jdbc_schema.db";
    HikariDataSource dataSource;

    public DBRepository() {
        dataSource = initDataSource(JDBC_Driver, JDBC_URL);
    }

    private HikariDataSource initDataSource(String JDBC_Driver, String JDBC_URL) {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(JDBC_Driver);
        config.setJdbcUrl(JDBC_URL);
        config.setLeakDetectionThreshold(2000);
        return new HikariDataSource(config);
    }

    public Optional<Car> findById(Long id) {
        return Optional.empty();
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
