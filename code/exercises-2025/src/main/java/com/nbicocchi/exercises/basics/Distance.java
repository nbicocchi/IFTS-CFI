package com.nbicocchi.exercises.basics;

import java.util.Scanner;

public class Distance {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.hypot(x1 - x2, y1 - y2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert x1: ");
        double x1 = in.nextDouble();
        System.out.print("Insert y1: ");
        double y1 = in.nextDouble();
        System.out.print("Insert x2: ");
        double x2 = in.nextDouble();
        System.out.print("Insert y2: ");
        double y2 = in.nextDouble();
        System.out.println("distance = " + distance(x1, y1, x2, y2));

    }
}
