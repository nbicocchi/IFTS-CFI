package com.nbicocchi.exercises.lesson9;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Es04 {
    /*
     * Verificare se due stringhe sono anagrammi.
     * Lo sono se una frase è originata invertendo
     * l'ordine dei caratteri dell'altra.
     * Non considerare gli spazi che possono essere diversi.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire frase 1:");
        String a = scanner.nextLine();

        System.out.println("Inserire frase 2:");
        String b = scanner.nextLine();

        System.out.println( sonoAnagrammi(a,b) );
    }

    private static boolean sonoAnagrammi(String a, String b) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            int count = map.getOrDefault(c, 0);
            if(c != ' ')
                map.put(c, count+1);
        }
        // nella mappa lascio le differenze di occorrenze
        for(int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            int count = map.getOrDefault(c, 0);
            if(c != ' ')
                map.put(c, count-1);
        }
        Set<Character> set = map.keySet();
        for(char key : set) {
            int count = map.get(key);
            if(count != 0) return false;
        }
        return true;
    }
}