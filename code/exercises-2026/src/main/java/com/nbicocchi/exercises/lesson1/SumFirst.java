package com.nbicocchi.exercises.lesson1;

public class SumFirst {
    public static void main(String[] args) {
        int n = 2;

        int sum = 0;
        int i = 0;

        while (i <= n) {
            sum = sum + i;
            i = i + 1;
        }

        System.out.println(sum);
    }
}
