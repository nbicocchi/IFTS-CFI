package com.nbicocchi.exercises.lesson8.shape;

public class Rect extends AbstractShape {
    float a;
    float b;

    public Rect(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public double area() {
        return a * b;
    }

    public void b() {
        System.out.println("b");
    }
}
