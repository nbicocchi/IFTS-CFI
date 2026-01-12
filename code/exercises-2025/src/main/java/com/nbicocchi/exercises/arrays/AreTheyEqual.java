package com.nbicocchi.exercises.arrays;

/**
 * A simple exercise verifying if two arrays are equal
 */
public class AreTheyEqual {
    public static boolean areTheyEqual(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areTheyEqual(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}));
        System.out.println(areTheyEqual(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 7, 4, 5}));
    }
}
