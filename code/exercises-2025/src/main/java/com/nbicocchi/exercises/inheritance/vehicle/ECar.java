package com.nbicocchi.exercises.inheritance.vehicle;

public class ECar extends Vehicle {
    double speed;
    int batteryLevel; // 0 - 100 interval

    public ECar(String brand, String model, int year, double speed, int batteryLevel) {
        super(brand, model, year);
        this.speed = speed;
        this.batteryLevel = batteryLevel;
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
        return;
    }

    @Override
    public int getFuelLevel() {
        return batteryLevel;
    }

    public void charge(int percentage) {
        batteryLevel += percentage;
    }


}
