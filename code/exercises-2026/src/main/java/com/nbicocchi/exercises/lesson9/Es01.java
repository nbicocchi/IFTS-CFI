package com.nbicocchi.exercises.lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Es01 {
    /*
    * Dato un array list di 10 valori (hardcoded)
    * creare la funzione (static) remove()
    * che chieda in input all'utente un valore da rimuovere
    * e rimuova dall'array list tutte le sue occorrenze
    * in maniera iterativa, usando solo la funzione remove(int index)
    * o remove(object obj) propria della classe ArrayList
    * */
    public static void main(String[] args) {
        ArrayList<String> elenco = new ArrayList<String>();
        elenco.add("Luca");    elenco.add("Giacomo");
        elenco.add("Giacomo"); elenco.add("Anna");
        elenco.add("Filippo"); elenco.add("Giulia");
        elenco.add("Giacomo"); elenco.add("Giacomo");
        elenco.add("Filippo"); elenco.add("Rebecca");
        elenco.add("Giacomo"); elenco.add("Giacomo");

        // remove(elenco);
        elenco = removeByCopy(elenco);
        for(String s : elenco) System.out.println(s);
    }

    static ArrayList<String> removeByCopy(ArrayList<String> elenco) {
        System.out.println("Valore da rimuovere:");
        Scanner scanner = new Scanner(System.in);
        String toRemove = scanner.next();

        ArrayList<String> copia = new ArrayList<>();
        for(String s : elenco) {
            if ( ! s.equals(toRemove) ) {
                copia.addLast(s);
            }
        }
        // elenco = copia; // non modifica l'elenco originale
        return copia;
    }

    static void remove(ArrayList<String> elenco) {
        System.out.println("Valore da rimuovere:");
        Scanner scanner = new Scanner(System.in);
        String toRemove = scanner.next();

        for(int i = elenco.size()-1; i >= 0; i--) { // leggo al contrario l'array
            String current = elenco.get(i);
            if( current.equals(toRemove) )
                elenco.remove(i);
        }

        // Inefficiente e criptico ma funzionante
        /*
        while( elenco.remove(toRemove) ) {}
         */

        // Non posso rimuovere da un array mentre lo scorro
        /*
        for(String s : elenco) { // leggo ogni elemento
            if( s.equals(toRemove) ) {
                elenco.remove(s);
            }
        }
         */

        // Se rimuovo e vado avanti l'elemento dopo la rimozione non viene valutato
        /*
        for(int i = 0; i < elenco.size(); i++) { // leggo ogni elemento
            String current = elenco.get(i);
            if( current.equals(toRemove) ) {
                elenco.remove(toRemove);
                i--;
            }
        }
         */
    }
}
