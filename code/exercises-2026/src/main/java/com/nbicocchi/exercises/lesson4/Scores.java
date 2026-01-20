package com.nbicocchi.exercises.lesson4;

public class Scores {

    public static int sufficients(int[] v) {
        int n = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= 18) {
                n++;
            }
        }
        return n;
    }

    public static double averageGrade(int[] v) {
        double sum = 0.0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        return sum / v.length;
    }


    public static void main(String[] args) {
        // ritorna numero di sufficienti
        // ritorna voto medio

        int[] scores = {18,22,25,27,27,30,31,22};
        System.out.println(sufficients(scores));
        System.out.println(averageGrade(scores));


    }
}
