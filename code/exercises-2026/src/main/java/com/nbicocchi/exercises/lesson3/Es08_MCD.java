package org.example;

import java.util.Scanner;

public class Es08_MCD {

    /*
    * Dati due numeri interi e positivi (non da verificare)
    * calcolare il massimo comune divisore ovvero:
    * il più grande numero a dividere senza resto entrambi
    * i numeri dati
    * */
    public static void main(String[] args) {
        // chiedi due numeri a e b in input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire primo numero");
        int a = scanner.nextInt();
        System.out.println("Inserire secondo numero");
        int b = scanner.nextInt();

        // imposta la variabile per il risultato (massimo comune divisore)
        int MCD = a < b ? a : b; // il minore dei due è il miglior punto di partenza
        // l'operatore ternario verifica una condizione e ritorna il primo valore se vera, il secondo se falsa
        // se a < b ritorna a, altrimenti ritorna b
        if (a<b) MCD = a;
        else MCD = b;

        // calcola il risultato in manuera iterativa
        while(a % MCD != 0 || b % MCD != 0) {
            // se il resto è diverso da 0 devo provare un altro numero
            MCD--;
        }
        System.out.println(MCD);
    }
}
