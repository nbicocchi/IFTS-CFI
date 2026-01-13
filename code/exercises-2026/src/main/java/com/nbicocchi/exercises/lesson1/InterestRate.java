package com.nbicocchi.exercises.lesson1;

public class InterestRate {
    public static double interests(double initialBalance, double rate, int years) {
        double balance = initialBalance;
        for (int i = 0; i < years; i++) {
            balance = balance + (balance * rate);
        }
        return balance;
    }

    public static void main(String[] args) {
        System.out.println(interests(10000, 0.25, 10));
    }
}
