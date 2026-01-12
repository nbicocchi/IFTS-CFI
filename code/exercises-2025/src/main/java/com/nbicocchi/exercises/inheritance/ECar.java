package com.nbicocchi.exercises.inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ECar extends Car {
    double batteryCapacity;

    public ECar(String brand, String model, double hp, double batteryCapacity) {
        super(brand, model, hp);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "ECar{" +
                "batteryCapacity=" + batteryCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", hp=" + hp +
                '}';
    }

    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        cars.add(new Car("fiat", "punto", 60));
        cars.add(new ECar("porsche", "cayman", 600, 100));

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
