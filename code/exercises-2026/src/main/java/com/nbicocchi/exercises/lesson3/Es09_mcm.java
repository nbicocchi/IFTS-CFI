package org.example;

import java.util.Scanner;

public class Es09_mcm {

    /*
     * Dati due numeri interi e positivi (non da verificare)
     * calcolare il minimo comune multiplo ovvero:
     * il più piccolo numero ad essere divisibile senza resto
     * da entrambi i numeri dati
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Far ripartire il programma finchè l'utente lo desidera
        while (true) { // possiamo usare anche un do-while
            //eseguo il mio programma
            mcm();

            System.out.println("Vuoi continuare?");
            String resp = scanner.next();
            if(resp.equals("no")) break;
        }
    }

    /* calcola un unico giro di mcm */
    public static void mcm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero 1:");
        int a = scanner.nextInt();
        System.out.println("Numero 2:");
        int b = scanner.nextInt();
        int m = a > b ? a : b; // ritorna il maggiore dei due
        while (m % a != 0 || m % b != 0) {
            m++;
        }
        System.out.println(m);
    }
}
