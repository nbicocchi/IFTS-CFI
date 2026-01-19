package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Es01_Scuole {

    /*
     * Dato un numero intero come prima riga del software
     * creare un programma che stampi la scuola che si sta frequentando
     * ipotizziamo nessuna bocciatura, nessuna primina
     * [0-1[ casa
     * [1-3[ nido
     * [4-6[ materna
     * [6-11[ elementari
     * [11-14[ medie
     * [14-19[ superiori
     * [19-65] quello che vuoi, si spera NASPI
     * [66+ pensione, si spera
     * */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Carbonara c = new Carbonara(bucatino, uovo, pecorino, guanciale, pepe);

        System.out.println("Inserire età: ");
        int eta = scanner.nextInt();

        // int eta = 3;

        if(eta < 0) {
            System.out.println("Errore");
        }
        else if(eta < 1) {
            System.out.println("In braccio");
        }
        else if(eta < 3) { // && eta >= 1 non serve verificarla
            System.out.println("Nido");
        }
        else if(eta < 6) {
            System.out.println("Materna");
        }
        else if(eta < 11) {
            System.out.println("Elementari");
        }
        else if(eta < 14) {
            System.out.println("Medie");
        }
        else if(eta < 19) {
            System.out.println("Superiori");
        }
        else if(eta < 65) {
            System.out.println("Scegli tu");
        }
        else {
            System.out.println("Pensione");
        }
    }
}


//
//package org.example;
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//
//    /*
//    * Dato un numero intero come prima riga del software
//    * creare un programma che stampi la scuola che si sta frequentando
//    * ipotizziamo nessuna bocciatura, nessuna primina
//    * [0-1[ casa
//    * [1-3[ nido
//    * [4-6[ materna
//    * [6-11[ elementari
//    * [11-14[ medie
//    * [14-19[ superiori
//    * [19-65] quello che vuoi, si spera NASPI
//    * [66+ pensione, si spera
//    * */
//
//    public static void main(String[] args) {
//        int eta = 15;
//
//        // TODO esercizio
//        if(eta >= 14 && eta < 19) {
//            System.out.println("Superiori");
//        }
//        else {
//            if(eta >= 1 && eta < 3)
//                System.out.println("Nido");
//            else {
//                if(eta > 65) {
//                    System.out.println("Pensione");
//                }
//            }
//        }
//    }
//}
