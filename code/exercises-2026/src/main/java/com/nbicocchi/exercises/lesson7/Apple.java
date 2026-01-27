package com.nbicocchi.exercises.lesson7;

import java.util.Objects;

public class Apple {
    String type;
    double weight;
    int rating;

    public Apple(String type, double weight, int rating) {
        this.type = type;
        this.weight = weight;
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Double.compare(weight, apple.weight) == 0 && rating == apple.rating && Objects.equals(type, apple.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight, rating);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", rating=" + rating +
                '}';
    }
}
