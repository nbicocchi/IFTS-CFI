package com.nbicocchi.exercises.lesson9;

import java.util.Scanner;

public class Es03 {
    /* data una string in input dall'utente
     * creare una funzione che ritorna true se è palindroma
     * false altrimenti
     * una stringa palindroma si legge nello stesso modo
     * da destra o da sinistra (ignorando caratteri non alfa-numerici)
     * i topi non avevano nipoti
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire una frase:");
        String s = scanner.nextLine();
        if( isPalindrome( s ) ) {
            System.out.println("Palindroma");
        }
        else {
            System.out.println("NON Palindroma");
        }
    }

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while ( i < j ){
            if( ! isAlphaNumeric( s.charAt(i) ) ) {
                i++;
                continue;
            }
            if( ! isAlphaNumeric( s.charAt(j) ) ) {
                j--;
                continue;
            }
            if( s.charAt(i) != s.charAt(j) ) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isAlphaNumeric(char c) {
        boolean lower = c >= 'a' && c <= 'z';
        boolean upper = c >= 'A' && c <= 'Z';
        boolean digit = c >= '0' && c <= '9';
        return lower || upper || digit;
    }
}
