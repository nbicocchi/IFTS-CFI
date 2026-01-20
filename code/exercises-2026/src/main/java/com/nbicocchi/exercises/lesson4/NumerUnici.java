package com.nbicocchi.exercises.lesson4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class NumerUnici {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci numero: ");

            int n = scanner.nextInt();
            if (n != -1) {
                l.add(n);
            } else {
                break;
            }
        }
        System.out.println(new HashSet<>(l).size());
        System.out.println(l);
    }
}
