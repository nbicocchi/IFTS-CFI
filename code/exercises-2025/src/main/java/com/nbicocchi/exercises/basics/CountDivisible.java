package com.nbicocchi.exercises.basics;

public class CountDivisible {
    public static int countDivisible(int lower, int upper, int key) {
        int count = 0;
        for (int i = lower; i <= upper; i++) {
            if (i % key == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDivisible(0, 10, 3));
        System.out.println(countDivisible(10, 100, 5));
    }
}
