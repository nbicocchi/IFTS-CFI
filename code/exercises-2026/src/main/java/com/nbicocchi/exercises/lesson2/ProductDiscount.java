package com.nbicocchi.exercises.lesson2;

public class ProductDiscount {
    public static double getPrice(String productID, double price) {
        if (productID.startsWith("AB")) {
            return price * 0.9;
        } else {
            return price;
        }
    }

    public static void main(String[] args) {
        System.out.println(getPrice("AB123-234", 22));
        System.out.println(getPrice("CC123-234", 33));
    }
}
