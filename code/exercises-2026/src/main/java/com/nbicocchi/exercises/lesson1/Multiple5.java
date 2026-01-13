package com.nbicocchi.exercises.lesson1;

public class Multiple5 {
    public static boolean isOK(int n) {
        if ((n % 5 == 0) && (n > 50)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 103;
        System.out.println(isOK(n));
    }
}
