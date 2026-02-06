package com.nbicocchi.exercises.lesson9;

import java.util.ArrayList;

public class Es05 {
    /**
     * Sistema di pagamento con 3 classi concrete che
     * implementano una medesima astratta.
     * Una classe carrello (che non estende nulla)
     * implementa il metodo checkout dato un metodo di pagamento.
     * MetodoDiPagamento Abstract (non può essere istanziato)
     * Paypal, CC e Bonifico sono i nostri metodi di pagamento.
     * Sistema: è una interfaccia che prevede il metodo paga.
     * Nel main fare ordini di prodotti e effettuare il pagamento.
     * Prodotto.
     */
    public static void main(String[] args) {
        Prodotto p1 = new Prodotto("Pizza Diavola", 7.5);
        Prodotto p2 = new Prodotto("Pizza Gourmet", 11.5);
        Prodotto p3 = new Prodotto("Pizza Margherita", 6);
        Prodotto p4 = new Prodotto("Pizza Kebab", 8);
        Prodotto p5 = new Prodotto("Pizza Diavola", 17.5);

        Carrello carrello = new Carrello();
        carrello.add(p1);
        carrello.add(p4);
        carrello.add(p1);
        carrello.add(p5);

        System.out.println(carrello);


    }
}
