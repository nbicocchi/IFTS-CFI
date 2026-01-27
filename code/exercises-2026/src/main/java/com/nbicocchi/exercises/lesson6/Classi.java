package com.nbicocchi.exercises.lesson6;

public class Classi {

    static void main(String[] args) {
        Persona p1 = new Persona("Filippo"); // chiama il costruttore
        Persona p2 = new Persona("Flavia");

        // p1.nome = "Giacomo";
        p1.setNome("Giacomo");
        p2.setNome("Goku");
        p2.setNome("");

        p1.Saluta();
        p2.Saluta();

        System.out.println( p1 ); // chiama la toString della classe Persona

        String s = p1.Ripeti("Ciao ", 3);
        System.out.println( s );

        p1.telefono = "118";
        //p1.NUMERO_SICUREZZA = "0";
        System.out.println( p1.NON_INIZIALIZZATO );
        System.out.println( p2.NON_INIZIALIZZATO );

        System.out.println(Persona.NUMERO_SICUREZZA);
        System.out.println(p1.NUMERO_SICUREZZA);
        System.out.println(Persona.istanze_create);
    }
}
