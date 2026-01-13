package com.nbicocchi.exercises;

public class AgeVerification {

    public static boolean verify(int age) {
        if (age > 17) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int age = 9;
        if (verify(age)) {
            System.out.println("maggiorenne");
        } else {
            System.out.println("minorenne");
        }
    }
}
