package com.nbicocchi.exercises.collections;

import java.util.ArrayList;

/**
 * Create a program that allows the user to perform the following operations on a list of student grades stored in an ArrayList:
 *
 * Add a grade to the list.
 * Remove a grade from the list.
 * Display all grades.
 * Calculate and display the average grade.
 * Exit the program.
 */
public class Grades {
    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(7.0);
        grades.add(8.1);
        grades.add(5.8);
        grades.remove(7.0);
        System.out.println(grades);

        double avg = 0.0;
        for (int i = 0; i < grades.size(); i++) {
            avg = avg + grades.get(i);
        }
        avg = avg / grades.size();
        System.out.println(avg);
    }
}
