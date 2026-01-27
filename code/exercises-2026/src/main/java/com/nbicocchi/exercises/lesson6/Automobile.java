package com.nbicocchi.exercises.lesson6;

public abstract class Automobile {

    // ATTRIBUTI
    String targa;

    int cilindrata;
    double potenza; // float basta come precisione
    int porte; // byte basta come numero di valori

    String alimentazione;
    double peso;
    double costo;

    // METODI
    public Automobile(String targa, String alimentazione) {
        this.targa = targa;
        this.alimentazione = alimentazione;
        // TODO tutti gli altri attributi
    }

    public Automobile(String targa, String alimentazione, int cilindrata) {
        this.targa = targa;
        this.alimentazione = alimentazione;
        this.cilindrata = cilindrata;
    }

    public void Sgasa() {
        System.out.println("WROOOM");
    }

    public void Suona() {
        System.out.println("BIP BIP");
    }

    public void Accelera() {
        // non riusciamo a scrivere questo codice
    }
}
