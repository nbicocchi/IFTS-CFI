package org.example;

import java.util.Scanner;

public class Es05_While {
    /* chiedi all'utente di inserire parole finchè non digita "stop"
       contare quante parole siano interamente uppercase
     */

    /* Ritorna vero se la stringa è maiuscola, falso altrimenti */
    public static boolean isUpperCase(String s) { // ciò che arriva dall'esterno è detto parametro
        // toUpperCase ritorna una NUOVA stringa in maiuscolo
        return s.equals( s.toUpperCase() );
    }

    // public static Piatto Carbonara(Pasta formato, Uovo uovo, Formaggio formaggio) {}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creo una sola volta lo scanner
        int contatore = 0;
        String risposta; // esiste una variabile risposta che ancora non serve

        do // iterazione post-condizionale
        {
            System.out.println("Inserire parola: ");
            risposta = scanner.next();

            if( isUpperCase(risposta) ) {
                contatore++;
            }
        }
        while ( ! "stop".equals(risposta) );

        System.out.println(contatore);
    }

}
