package com.nbicocchi.exercises.lesson9;

import java.util.ArrayList;
import java.util.HashMap;

public class Carrello {
    private HashMap<Prodotto, Integer> carrello = new HashMap<Prodotto, Integer>();

    public void add(Prodotto p) {
        int count = carrello.getOrDefault(p, 0);
        carrello.put(p, count+1);
    }

    public double totalPrice() {
        return 0;
    }

    //semplifica toString
    @Override
    public String toString() {
        String s = "[\n";
        for(Prodotto p : carrello.keySet()) {
            int q = carrello.get(p);
            double tot = q * p.prezzo;
            s += "\t" + p + " - x" + q + " - " + tot + "€\n";
        }
        return s + "]";
    }
}
