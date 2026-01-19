package org.example;

import java.util.Scanner;

public class Es04_While {
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
        String risposta = "";
        int contatore = 0;
        // while( risposta.equals("stop") ) // finchè una condizione è vera
        while( ! "stop".equals(risposta) ) // finchè una condizione è vera
        {
            System.out.println("Inserire parola: ");
            risposta = scanner.next();

            // passo la variabile risposta alla funzione
            // dentro la funzione si chiamerà s
            if( isUpperCase(risposta) ) {
                contatore++;
            }
        }
        System.out.println(contatore);
    }

}
