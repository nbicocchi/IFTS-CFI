package com.nbicocchi.exercises.basics;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double input;
        while (true) {
            System.out.print("Insert a number: ");
            input = scanner.nextDouble();
            sum = sum + input;
            if (input == 0) {
                break;
            }
        }
        System.out.println("Sum: " + sum);
    }
}

