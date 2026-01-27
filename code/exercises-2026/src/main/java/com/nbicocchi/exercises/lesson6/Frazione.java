package com.nbicocchi.exercises.lesson6;

public class Frazione {

    /*
    * Implementare la classe Frazione per gestire i numeri razionali
    * e le operazioni tra di essi (+ - * /).
    * Non è possibile sommare due frazioni con f1 + f2 ma si userà
    * un metodo tipo f1.sum(f2) .
    * Considera anche il segno della frazione (positiva o negativa).
    * Una frazione deve sempre essere salvata come ridotta ai minimi termini.
    * è fondamentale quindi calcolare sempre MCD tra numeratore e denominatore.
    * */

    private int numeratore;
    private int denominatore;
    private int segno;

    public Frazione(int numeratore, int denominatore) {
        this.numeratore = numeratore >= 0 ? numeratore : -numeratore;
        this.denominatore = denominatore >= 0 ? denominatore : -denominatore;
        this.segno = (numeratore * denominatore) >= 0 ? +1 : -1;
    }

    public Frazione sum(Frazione other) {
        int num = this. segno * this.numeratore * other.denominatore +
                other.segno * other.numeratore * this.denominatore;
        int den = other.denominatore * this.denominatore;
        return new Frazione(num,den);
    }

    @Override
    public String toString() {
        String s = segno > 0 ? "+" : "-";
        return s + numeratore + "/" + denominatore;
    }

    public static void main(String[] args) {
        Frazione f1 = new Frazione(-2,5);
        Frazione f2 = new Frazione(3,4);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f1.sum(f2));
    }
}
