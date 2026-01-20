package com.nbicocchi.exercises.lesson2;

import java.util.Scanner;

public class Weather {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci temp :");
        double t = scanner.nextDouble();

        if (t > 30) {
            System.out.println("fa caldo");
        } else if (t > 15) {
            System.out.println("ok");
        } else if (t > 5) {
            System.out.println("ancora decente");
        } else {
            System.out.println("freddo");
        }
    }
}
