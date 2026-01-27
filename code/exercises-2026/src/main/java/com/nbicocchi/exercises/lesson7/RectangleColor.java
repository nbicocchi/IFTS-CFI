package com.nbicocchi.exercises.lesson7;

import java.awt.*;

public class RectangleColor extends Rectangle {
    Color color;

    public RectangleColor(double x, double y, double w, double h, Color color) {
        super(x, y, w, h);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Rectangle r2 = new Rectangle(0,0,10,10);
        RectangleColor r1 = new RectangleColor(0,0,10,10, Color.BLUE);
        System.out.println(r2.area());
        System.out.println(r1.area());
    }

}
