package com.nbicocchi.exercises.lesson4;

import java.util.Arrays;

public class Contains {
    public static boolean contains(int x, int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void fill(int x, int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = x;
        }
    }

    public static void main(String[] args) {
        int[] v = new int[100];
        v[17] = 17;

        System.out.println(contains(17, v));
        fill(47, v);
        System.out.println(Arrays.toString(v));
    }
}
