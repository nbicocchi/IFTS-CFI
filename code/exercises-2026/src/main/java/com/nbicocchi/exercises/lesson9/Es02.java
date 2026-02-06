package com.nbicocchi.exercises.lesson9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Es02 {
    // creare un programma dove iterativamente popoliamo una lista
    // inserendo i valori da tastiera (i valori sono frutti)
    // finchè l'utente non digita stop
    // rimuovi i valori che compaiono almeno 2 volte nella lista
    // vogliamo quindi una lista che non abbia duplicati
    // e non abbia nemmeno i valori che prima comparivano 2+ volte
    public static void main(String[] args) {
        ArrayList<String> frutti = new ArrayList<>();
        while (true) {
            System.out.println("Frutto: ['stop' per terminare]");
            Scanner scanner = new Scanner(System.in);
            String frutto = scanner.next();
            if( frutto.toLowerCase().equals("stop") ) break; // se entro nell'if esco dal while
            frutti.add(frutto); // frutto qua non risente del lower case
        }

        //contiamo le occorrenze delle parole
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for(String frutto : frutti) {
            int count = hashMap.getOrDefault(frutto, 0);
            hashMap.put(frutto, count+1);
        }

        frutti.clear();

        for(String key : hashMap.keySet()) { // keySet ci ritorna tutte le chiavi
            int value = hashMap.get(key);
            System.out.println("Il frutto " + key + " compare " + value + " volte");

            if(value == 1) {
                frutti.add(key);
            }
        }

        for(String frutto : frutti)
            System.out.println(frutto);
    }
}
