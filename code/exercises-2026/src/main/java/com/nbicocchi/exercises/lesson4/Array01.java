package com.nbicocchi.exercises.lesson4;

import java.util.Arrays;

public class Array01 {

    public static String printArray(int [] v) {
        String s = "";
        for (int i = 0; i < v.length; i++) {
            s = s + v[i] + ", ";
        }
        return s;
    }

    public static void shiftRight(int[] v) {
        for (int i = v.length - 1; i > 0; i--) {
            v[i] = v[i - 1];
        }
    }

    public static void main(String[] args) {
        int[] v = new int[10];

        System.out.println(v.length);

        for (int i = 0; i < 10; i++) {
            v[i] = i;
        }

        System.out.println(Arrays.toString(v));
        shiftRight(v);
        System.out.println(Arrays.toString(v));

    }
}
