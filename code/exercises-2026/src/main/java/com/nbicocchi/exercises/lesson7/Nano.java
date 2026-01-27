package com.nbicocchi.exercises.lesson7;

import java.awt.*;
import java.util.Objects;

public class Nano {
    String material;
    Color color;
    double h;

    public Nano(String material, Color color, double h) {
        this.material = material;
        this.color = color;
        this.h = h;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Nano{" +
                "material='" + material + '\'' +
                ", color=" + color +
                ", h=" + h +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Nano nano = (Nano) o;
        return Double.compare(h, nano.h) == 0 && Objects.equals(material, nano.material) && Objects.equals(color, nano.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, color, h);
    }

    public static void main(String[] args) {
        Nano n1 = new Nano("Steel", Color.RED, 50);
        Nano n2 = new Nano("Steel", Color.BLACK, 50);
        System.out.println(n1.equals(n2));
    }
}
