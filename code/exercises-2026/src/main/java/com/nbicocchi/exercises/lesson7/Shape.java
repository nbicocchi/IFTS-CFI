package com.nbicocchi.exercises.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    public double area() {
        return 0.0;
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rect(10, 5));
        shapes.add(new Triang(10, 10));

        for (Shape s : shapes) {
            System.out.println(s.area());
        }
    }
}
