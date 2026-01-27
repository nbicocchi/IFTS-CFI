package org.example;

public class Ferrari extends Automobile {

    // ATTRIBUTI che la ferrari ha ma le altre auto NO!
    public static final String ASSISTENZA_CLIENTI = "+39 1518";
    public static final String ROSSO_FERRARI = "rgb(196,21,28)";

    public Ferrari(String targa) {
        super(targa, "Benzina");
    }

    public Ferrari(String targa, int cilindrata) {
        super(targa, "Benzina", cilindrata);
    }

    public void PerdiUnGp() {
        System.out.println("Non ho vinto");
    }
}
