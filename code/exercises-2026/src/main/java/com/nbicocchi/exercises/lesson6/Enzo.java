package com.nbicocchi.exercises.lesson6;

public class Enzo extends Ferrari {

    public static void main(String[] args) {
        Enzo auto = new Enzo("HB025FE");
        auto.Sgasa();
    }

    public Enzo(String targa) {

        super(targa, 6000);
    }
}
