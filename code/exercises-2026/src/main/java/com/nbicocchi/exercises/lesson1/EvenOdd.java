package com.nbicocchi.exercises.lesson1;

public class EvenOdd {

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 9;
        if (isEven(n)) {
            System.out.println("pari");
        } else {
            System.out.println("dispari");
        }
    }
}
