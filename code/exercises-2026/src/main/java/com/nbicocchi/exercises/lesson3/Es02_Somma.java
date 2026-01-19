package org.example;

import java.util.Scanner;

public class Es02_Somma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // chiedi in input all'utente 10 valori numerici interi
        // calcola la somma di questi

        int somma = 0; // deve contenere il risultato parziale

        // int i = 0; è come se fosse inizializzato qua
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Inserisci il " + (i+1) + "° numero:");
            int n = scanner.nextInt(); // è bloccante, non prosegue finchè non premiamo invio

            // somma = somma + n;
            somma += n; // calcola somma + n e riscrivilo dentro a somma

            // i++; // è come se eseguisse qua
        }

        System.out.println("La somma vale: " + somma);
    }

}
