package org.example;

import java.util.Scanner;

public class Es07_Array {
    public static void main(String[] args) {
        /*
        * Dobbimo gestire l'altezza di tutti i partecipanti al corso
        * Possiamo creare una variabile per ogni persona?
        * Necesstito che i dati persistano anche dopo la fine del loop di inserimento
        * */

        int N = 16;

        int[] a = new int[N]; // crea 16 celle adiacenti in memoria

        System.out.println( a[0] );

        a[1] = 1;
        a[2] = 99;

        a[3] = a[1] + a[2];

        System.out.println( a[3] );
        // le righe sopra sono solo per mostrare come si usa un array

        Scanner scanner = new Scanner(System.in);
        // riempire l'array con valori scritti in input dall'utente
        for(int i = 0; i < a.length; i++) { // questa riga imposta l'indice di accesso
            System.out.println("Inserire altezza:");
            a[i] = scanner.nextInt();
        }

        for(int i = 0; i < a.length; i++) {
            System.out.println( a[i] );
        }

        // convertire da cm a pollici le altezze salvandole in un
        // nuovo array di float o double
        // ricorda che per passare da cm a pollici bisogna dividere
        // per 2.54

        double[] pollici = new double[N];

        for(int i = 0; i < N; i++) { // N è uguale a a.length e pollici.length
            pollici[i] = a[i] / 2.54;
            System.out.println( pollici[i] );
        }
    }
}
