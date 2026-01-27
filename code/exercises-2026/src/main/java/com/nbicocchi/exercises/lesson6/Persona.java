package org.example;

public class Persona {

    public static final String NUMERO_SICUREZZA = "112";
    public final int NON_INIZIALIZZATO;

    public static int istanze_create = 0;

    public String telefono = "+39 3451359064";

    // un attributo o metodo privato è visibile solo dentro la classe, mai fuori
    private String nome; // questo è un attributa

    // il costruttore è un funzione il cui nome
    // coincide con il tipo di dato di ritorno
    // che è la classe stessa
    public Persona(String nome) {
        NON_INIZIALIZZATO = nome.length();
        this.nome = nome;

        istanze_create++;
    }

    // Getter e Setter sono funzioni che ci permetto di modificare o leggere
    // i valori dei nostri attributi
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if("".equals(nome)) return;
        this.nome = nome;
    }

    public String toString() {
        return nome;
    }

    /// Data una stringa e un numero ritorna la stringa ripetuta n volte
    public String Ripeti(String s, int n) {
        // s.repeat(n);
        String res = "";
        for (int i = 0; i< n; i++) {
            res += s;
        }
        return res;
    }

    public void Saluta() {
        System.out.println("Ciao sono " +
                nome + ", una Persona"
        );
    }
}
