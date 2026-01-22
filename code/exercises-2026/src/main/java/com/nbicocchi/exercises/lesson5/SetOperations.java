package com.nbicocchi.exercises.lesson5;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Set.of(1,2,3));
        Set<Integer> s2 = new HashSet<>(Set.of(3,4,5));

        Set<Integer> union = new HashSet<>();
        union.addAll(s1);
        union.addAll(s2);

        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);

        Set<Integer> difference = new HashSet<>(s1);
        difference.removeAll(s2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(union);
        System.out.println(intersection);
        System.out.println(difference);

    }
}
