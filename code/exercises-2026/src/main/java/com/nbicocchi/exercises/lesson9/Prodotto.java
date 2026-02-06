package com.nbicocchi.exercises.lesson9;

public class Prodotto {
    public String nome;
    public double prezzo;
    public Prodotto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return nome + " " + prezzo;
    }
}