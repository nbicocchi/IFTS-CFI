package com.nbicocchi.exercises.lesson7;

public class Triang extends Shape {
    double b;
    double h;

    public Triang(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double area() {
        return b * h * 0.5;
    }
}
