package com.nbicocchi.exercises.lesson4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Retrieval {
    public static void main(String[] args) {
        Set<Integer> l = new HashSet<>();
        for (int i = 0; i < 100000; i++) {
            l.add(i);
        }


        long t1 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            l.contains(i);
        }
        long t2 = System.nanoTime();
        System.out.println((t2 - t1) / 1000000);


    }
}
