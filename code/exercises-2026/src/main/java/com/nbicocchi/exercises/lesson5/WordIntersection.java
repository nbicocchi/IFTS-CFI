package com.nbicocchi.exercises.lesson5;

import java.util.ArrayList;
import java.util.List;

public class WordIntersection {

    public static List<String> intersection(List<String> a, List<String> b) {
        List<String> l = new ArrayList<>();
        for (String s : a) {
            for (String s2 : b) {
                if (s.equals(s2)) {
                    l.add(s);
                }
            }
        }
        return l;
    }

    public static void main(String[] args) {
        List<String> a = List.of("nicola", "ciao");
        List<String> b = List.of("ciao", "mondo");
        System.out.println(intersection(a, b));
    }
}
