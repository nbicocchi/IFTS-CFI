package com.nbicocchi.exercises.lesson8.vehicles;

public abstract class Veicolo {
    String targa;

    public Veicolo(String targa) {
        this.targa = targa;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public abstract double kml();

    public abstract int wheels();
}
