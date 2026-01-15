package com.nbicocchi.exercises.lesson2;

public class Grades {
    public static String getWordforGrade(int grade) {
        if (grade < 8) {
            return "Ottimo";
        } else if (grade > 6) {
            return "Ok";
        } else if (grade > 4) {
            return "Scarso";
        } else  {
            return "Pessimo";
        }
    }

    public static void main(String[] args) {
        System.out.println(getWordforGrade(2));
    }
}
