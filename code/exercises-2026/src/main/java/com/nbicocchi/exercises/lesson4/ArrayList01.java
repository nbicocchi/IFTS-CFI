package com.nbicocchi.exercises.lesson4;

import java.util.*;

public class ArrayList01 {

    public static double min(ArrayList<Double> l) {
        double min = l.get(0);
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) < min) {
                min = l.get(i);
            }
        }
        return min;
    }

    public static double max(ArrayList<Double> l) {
        double max = l.get(0);
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) > max) {
                max = l.get(i);
            }
        }
        return max;
    }


    public static void main(String[] args) throws InterruptedException {
        List<Double> l = new LinkedList<>();

        for (double i = 0; i < 100000; i++) {
            l.add(i);
        }

        long t1 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            l.get(i);
        }
        long t2 = System.nanoTime();

        System.out.println((t2 - t1) / 1000000.0);






    }
}
