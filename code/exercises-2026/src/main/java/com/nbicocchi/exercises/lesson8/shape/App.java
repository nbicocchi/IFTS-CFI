package com.nbicocchi.exercises.lesson8.shape;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Shape> l = new ArrayList<>();
        l.add(new Rect(2,3));
        l.add(new Circle(2));

        for (Shape a : l) {
            if (a instanceof Circle) {
                Circle z = (Circle) a;
                z.a();
            }

            if (a instanceof Rect) {
                Rect z = (Rect) a;
                z.b();

            }
        }


    }
}
