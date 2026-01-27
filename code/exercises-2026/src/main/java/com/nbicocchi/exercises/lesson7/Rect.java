package com.nbicocchi.exercises.lesson7;

public class Rect extends Shape {
    double w;
    double h;

    public Rect(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public double area() {
        return w * h;
    }
}
