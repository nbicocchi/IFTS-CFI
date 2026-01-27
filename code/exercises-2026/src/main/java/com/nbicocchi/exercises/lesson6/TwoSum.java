package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

    /*
    * Dato un array di interi trovare tutte le coppie che
    * sommate diano il valore target
    * */
    public static void main(String[] args) {
        int[] a = new int[200000];
        a[0] = 8; a[1] = 9; a[2] = 7; a[3] = 4; a[4] = 2;
        a[5] = 1; a[6] = 3; a[7] = 5; a[8] = 11; a[9] = 17;

        int target = 6;

        // soluzione con le mappe
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < a.length; i++) {
            int n = a[i]; // leggo il numero corrente
            int t = target - n; // numero che sommato ad n darebbe target
            if( set.contains( t ) ) { // vedo se il numero c'è nel Set
                System.out.println(a[i] + " " + t);
            }
            set.add( n ); // lo aggiungo al set
        }

        System.out.println("FINE MAPPE");

        // soluzione senza le mappe
        for(int i = 0; i < a.length; i++) {
            for(int j = i+1; j < a.length; j++) {
                int somma = a[i] + a[j];
                if(somma == target) {
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }
    }
}
