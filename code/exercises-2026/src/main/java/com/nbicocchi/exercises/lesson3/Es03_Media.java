package org.example;

import java.util.Scanner;

public class Es03_Media {
    public static void main(String[] args) {
        // calcolare la media di 5 numeri inseriti dall'utente
        Scanner s = new Scanner(System.in);

        float media = 0;

        for(int i = 0; i < 5; i++) {
            System.out.println("Inserire numero: ");
            float n = s.nextFloat();
            media += n;

            // media += s.nextFloat();
        }

        media /= 5;

        System.out.println(media);
    }
}
