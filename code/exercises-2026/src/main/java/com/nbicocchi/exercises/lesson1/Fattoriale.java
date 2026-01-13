package com.nbicocchi.exercises.lesson1;

public class Fattoriale {
    public static long fattoriale(int n) {
        int i = 1;
        long fatt = 1;
        while (i <= n) {
            fatt = fatt * i;
            i = i + 1;
        }
        return fatt;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fattoriale(n));
    }
}
