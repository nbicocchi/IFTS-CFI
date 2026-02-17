package com.nbicocchi.exercises.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Repository {
    List<Car> cars;
    Long nextIndex = 0L;

    public Repository() {
        this.cars = new ArrayList<>();
    }

    public Optional<Car> findById(Long id) {
        for (Car car : cars) {
            if (car.id.equals(id)) {
                return Optional.of(car);
            }
        }
        return Optional.empty();
    }


    public Iterable<Car> findAll() {
        return cars;
    }

    public Car save(Car entity) {
        if (entity.id == null) {
            return insert(entity);
        } else {
            Optional<Car> optional = findById(entity.id);
            if (optional.isPresent()) {
                cars.set(cars.indexOf(entity), entity);
            } else {
                return insert(entity);
            }
        }
        return entity;
    }

    private Car insert(Car car) {
        car.id = nextIndex++;
        cars.add(car);
        return car;
    }

    public void delete(Car entity) {
        cars.remove(entity);
    }

    public void deleteById(Long id) {
        Optional<Car> entity = findById(id);
        if (entity.isPresent()) {
            cars.remove(entity.get());
        }
    }

    public void deleteAll() {
        cars.clear();
    }

}
