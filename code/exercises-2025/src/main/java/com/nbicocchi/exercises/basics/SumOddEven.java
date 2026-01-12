package com.nbicocchi.exercises.basics;

public class SumOddEven {
    public static int sumOddUntil(int n) {
        int sum = 0;
        for (int i = 1; i < n; i = i + 2) {
            sum += i;
        }
        return sum;
    }

    public static int sumEvenUntil(int n) {
        int sum = 0;
        for (int i = 0; i < n; i = i + 2) {
            sum += i;
        }
        return sum;
    }

    public static int sumUntil(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumUntil(10));
        System.out.println(sumOddUntil(10));
        System.out.println(sumEvenUntil(10));
    }
}
