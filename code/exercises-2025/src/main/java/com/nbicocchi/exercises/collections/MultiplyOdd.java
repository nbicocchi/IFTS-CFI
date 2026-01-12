package com.nbicocchi.exercises.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Write a Java program that performs the following operations on an ArrayList of integers:
 *
 * Create an ArrayList and add numbers from 1 to 10.
 * Remove all even numbers from the list.
 * Multiply each remaining number by 2.
 * Print the modified list.
 */
public class MultiplyOdd {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        list.removeAll(List.of(2,4,6,8,10));

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }
        System.out.println(list);
    }
}
