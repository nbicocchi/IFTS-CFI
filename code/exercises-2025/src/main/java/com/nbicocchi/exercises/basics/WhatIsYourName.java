package com.nbicocchi.exercises.basics;

import java.util.Scanner;

public class WhatIsYourName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("What is your name? ");
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("nicola")) {
                System.out.println("very good!");
                break;
            } else {
                System.out.println("not good!");
            }
        }
    }
}
