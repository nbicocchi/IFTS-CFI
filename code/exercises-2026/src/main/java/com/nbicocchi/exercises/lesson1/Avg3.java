package com.nbicocchi.exercises.lesson1;

public class Avg3 {

    public static double avg3(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static double sum3(double a, double b, double c) {
        return a + b + c;
    }

    public static int sumWords(String a, String b) {
        return a.length() + b.length();
    }

    public static void main(String[] args) {
        double a = 3.2;
        double b = 3.1;
        double c = 3.3;
        System.out.printf("%.2f", avg3(a, b, c));
        System.out.printf("%.2f", sum3(a, b, c));
    }
}



