package com.nbicocchi.exercises.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DBRepository implements Repository<Car, Long> {


    public DBRepository() {

    }

    private HikariDataSource initDataSource(String JDBC_Driver, String JDBC_URL) {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(JDBC_Driver);
        config.setJdbcUrl(JDBC_URL);
        config.setLeakDetectionThreshold(2000);
        return new HikariDataSource(config);
    }

    public Optional<Car> findById(Long id) {

    }


    public Iterable<Car> findAll() {

    }

    public Car save(Car entity) {

    }

    private Car insert(Car car) {

    }

    public void delete(Car entity) {

    }

    public void deleteById(Long id) {

    }

    public void deleteAll() {

    }

}
