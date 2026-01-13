package com.nbicocchi.exercises.lesson1;

public class Cars {
    public static double fuelCost = 1.6;
    public static double kmy = 15000;

    public static double TCO(double price, double kml, double years) {
        return price + (15000 / kml) * fuelCost * years;
    }

    public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            System.out.println(i + " " + TCO(20000, 10, i) + " " + TCO(15000, 8, i));
            i++;
        }

    }
}
