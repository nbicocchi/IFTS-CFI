package com.nbicocchi.exercises.lesson8.vehicles;

public class AgustaBrutale extends Veicolo {

    public AgustaBrutale(String targa) {
        super(targa);
    }

    @Override
    public double kml() {
        return 11;
    }

    @Override
    public int wheels() {
        return 2;
    }
}
