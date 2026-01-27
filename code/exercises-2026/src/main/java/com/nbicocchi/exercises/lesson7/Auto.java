package com.nbicocchi.exercises.lesson7;

public class Auto extends Veicolo {
    String modello;

    public Auto(String marca, String modello) {
        super(marca);
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Auto a = new Auto("VW", "Touran");
        System.out.println(a);

        Veicolo v = new Veicolo("BWM");
        System.out.println(v);
    }
}
