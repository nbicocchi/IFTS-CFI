package com.nbicocchi.exercises.collections;

import java.util.ArrayList;
import java.util.List;

public class Collatz {
    public static List<Integer> collatz(Integer n) {
        List<Integer> result = new ArrayList<>(List.of(n));
        while(true) {
            Integer key = result.getLast();
            Integer next;
            if (key % 2 == 0) {
                next = key / 2;
            } else {
                next = 3 * key + 1;
            }
            result.add(next);
            if (next.equals(1)) {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 113383; i++) {
            List<Integer> collatz = collatz(i);
            if (!collatz.getLast().equals(1)) {
                System.out.println("something is trazzing!");
                break;
            }
        }
    }
}
