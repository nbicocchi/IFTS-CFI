package com.nbicocchi.exercises.lesson7;

public class Rectangle {
    // upper - left corner
    double x;
    double y;
    double w;
    double h;

    public Rectangle(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double area() {
        return w * h;
    }

    public double perimeter() {
        return 2 * (w + h);
    }

    public boolean isInside(Point p) {
        if ((p.getX() > x) && (p.getX() < x + w) &&
                (p.getY() > y) && (p.getY() < y + h)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                '}';
    }
}