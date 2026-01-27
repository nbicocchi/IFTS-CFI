package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class InteriRomani {
    /*
    * Dato un intero positivo chiesto in input all'utente
    * convertirlo in una stringa con il corrispondente numero romano.
    * I numeri sono inferiori a 4000.
    * I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
    * Le cifre arabe fino al 3 si ottengono per somma:
    * 3 = III, 30 = XXX.
    * La cifra araba 4 si ottiene per sottazione:
    * 4 = IV, 40 = XL, 400 = CM.
    * 1999 non è IM ma M CM XC IX.
    * */
    public static void main(String[] args) {
        // Dato un numero in input dall'utente
        System.out.println("Inserire un numero intero:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Definizione delle strutture dati di supporto
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");

        int[] livelli = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        String romano = "";

        for(int i = 0; i < livelli.length; i++) {
            int livello = livelli[i]; // il primo livello sarà 1000
            while (n >= livello) {
                romano += map.get(livello);
                n -= livello;
            }
        }

        System.out.println(romano);
    }
}
