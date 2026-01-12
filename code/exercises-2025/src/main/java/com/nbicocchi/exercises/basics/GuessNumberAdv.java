package com.nbicocchi.exercises.basics;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberAdv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int key = random.nextInt(0, 10);
        while(true) {
            System.out.print("Throw a number between 0 and 10: ");
            int guess = scanner.nextInt();
            if (guess == key) {
                System.out.println("Correct!");
                break;
            } else if (guess > key) {
                System.out.println("Too big!");
            } else {
                System.out.println("Too little!");
            }
        }
    }
}
