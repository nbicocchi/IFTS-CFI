package com.nbicocchi.exercises.lesson7;

public class Veicolo {
    String marca;

    public Veicolo(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
