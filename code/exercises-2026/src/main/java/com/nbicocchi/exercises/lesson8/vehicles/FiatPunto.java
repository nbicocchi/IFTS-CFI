package com.nbicocchi.exercises.lesson8.vehicles;

public class FiatPunto extends Veicolo {

    public FiatPunto(String targa) {
        super(targa);
    }

    @Override
    public double kml() {
        return 15;
    }

    @Override
    public int wheels() {
        return 4;
    }
}
