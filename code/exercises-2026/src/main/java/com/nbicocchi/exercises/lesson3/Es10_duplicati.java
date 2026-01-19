package org.example;

import java.util.Scanner;

public class Es10_duplicati {
    /*
    * dato un array di 10 stringhe stampare a video solo i valori duplicati
    * ovvero quelli che sono presenti nella lista più di due volte
    * (da fare dopo) se mela compare 7 volte, deve essere stampato solo 1 volta a video
    * */

    public static void main(String[] args) {
        String[] lista = new String[10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < lista.length; i++) {
            System.out.println("Dammi un frutto:");
            lista[i] = scanner.next(); // next legge le stringhe scritte
        }

        //inizia la ricerca dei duplicati
        for(int i = 0; i < lista.length; i++) { // per ogni frutto nella nella lista
            // devo sapere quante volte copare
            int count = 0;
            for(int j = i; j < lista.length; j++) { // confronto con ogni altro frutto
                if( lista[i].equals( lista[j] ) ) {
                    count++;
                }
            }
            // dopo averlo confrontato con tutti gli altri
            // stampo quante volte compare
            if(count == 2) { // stampo solo chi ne ha 2 dopo di se
                System.out.println(lista[i] + " : " + count);
            }
        }
    }
}
