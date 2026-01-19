package org.example;

import java.util.Scanner;

public class Es06_Media {
    public static void main(String[] args) {

        /* chiedere in input all'utente numeri
           finchè non digita stop... (occhio)
           calcolare quindi la media di tutti i numeri inseriti
           non sai a priori quanti ne hai inseriti però
           il numero è variabile
         */

        Scanner scanner = new Scanner(System.in);
        String s = "";
        double media = 0;
        int count = 0;
        while(true) { // esegue per sempre
            System.out.println("Numero: ");
            s = scanner.next(); // non è detto che legga un numero
            if(s.equals("stop")) {
                break; // mi fermo immediatamente
                // se entro nell'if non posso andare oltre questa riga
            }
            int n = Integer.parseInt(s); // se è un numero valido
            media += n;
            count++;
        }
        if(count == 0)
            count = 1;

        // il break mi porta immediatamente qua
        media /= count;
        System.out.println(media);
    }
}
