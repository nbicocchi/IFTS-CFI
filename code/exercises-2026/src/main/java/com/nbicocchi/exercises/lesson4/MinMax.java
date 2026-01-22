package com.nbicocchi.exercises.lesson4;

import java.util.ArrayList;
import java.util.List;

public class MinMax {

    public static double avg(List<Integer> l) {
        double sum = 0;
        for (int i : l) {
            sum = sum + i;
        }
        return sum / l.size();
    }

    public static double min(List<Integer> l) {
        double min = l.get(0);
        for (int i : l) {
            if (i < min) min = i;
        }
        return min;
    }

    public static double max(List<Integer> l) {
        double max = l.get(0);
        for (int i : l) {
            if (i > max) max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(22);
        l.add(33);
        l.add(11);

        System.out.println(min(l));
    }
}
