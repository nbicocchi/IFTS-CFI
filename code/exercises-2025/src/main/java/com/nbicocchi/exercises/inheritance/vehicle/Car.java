package com.nbicocchi.exercises.inheritance.vehicle;

public class Car extends Vehicle {
    double speed;
    int fuelLevel; // 0 - 100 interval

    public Car(String brand, String model, int year, double speed, int fuelLevel) {
        super(brand, model, year);
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void accelerate() {
        speed += 0.1;
    }

    @Override
    public void brake() {
        speed -= 0.1;
    }

    @Override
    public void refuel(int liters) {
        fuelLevel += liters;
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }
}
