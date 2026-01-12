package com.nbicocchi.exercises.basics;

public class Divide3and5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " --> ");
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("by 3 and 5");
            } else if (i % 3 == 0) {
                System.out.println("by 3");
            } else if (i % 5 == 0) {
                System.out.println("by 5");
            } else {
                System.out.println();
            }
        }
    }
}
