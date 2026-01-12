package com.nbicocchi.exercises.basics;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int key = random.nextInt(1, 11);

        int guess = -1;
        while (key != guess) {
            System.out.print("What is your guess? ");
            guess = scanner.nextInt();
        }
        System.out.println("You guessed right!");
    }
}
