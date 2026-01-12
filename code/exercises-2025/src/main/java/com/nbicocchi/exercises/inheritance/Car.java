package com.nbicocchi.exercises.inheritance;

public class Car {
    String brand;
    String model;
    double hp;

    public Car(String brand, String model, double hp) {
        this.brand = brand;
        this.model = model;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", hp=" + hp +
                '}';
    }
}
