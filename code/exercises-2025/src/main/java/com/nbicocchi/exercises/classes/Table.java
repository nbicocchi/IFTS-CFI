package com.nbicocchi.exercises.classes;

import java.awt.*;
import java.util.Objects;

public class Table {
    String model;
    Color color;
    double width;
    double length;
    double height;

    public Table(String model, Color color, double width, double length, double height) {
        this.model = model;
        this.color = color;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return Double.compare(width, table.width) == 0 && Double.compare(length, table.length) == 0 && Double.compare(height, table.height) == 0 && Objects.equals(model, table.model) && Objects.equals(color, table.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, width, length, height);
    }

    @Override
    public String toString() {
        return "Table{" +
                "model='" + model + '\'' +
                ", color=" + color +
                ", width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Table t1 = new Table("Giuditta", new Color(1.0F,0.0F,0.0F), 1.0, 2.0, 1.0);
        System.out.println(t1);
    }
}
