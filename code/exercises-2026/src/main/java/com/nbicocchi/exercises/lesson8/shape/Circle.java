package com.nbicocchi.exercises.lesson8.shape;

public class Circle extends AbstractShape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
    public double area() {
        return r * r * Math.PI;
    }

    public void a() {
        System.out.println("a");
    }
}
