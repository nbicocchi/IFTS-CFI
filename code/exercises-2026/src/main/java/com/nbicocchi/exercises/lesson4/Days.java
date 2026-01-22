package com.nbicocchi.exercises.lesson4;

import java.util.HashMap;
import java.util.Map;

public class Days {

    public static int dayToNumber(String giorno) {
        int numeroGiorno;

        if (giorno.equals("Lunedì")) {
            numeroGiorno = 1;
        } else if (giorno.equals("Martedì")) {
            numeroGiorno = 2;
        } else if (giorno.equals("Mercoledì")) {
            numeroGiorno = 3;
        } else if (giorno.equals("Giovedì")) {
            numeroGiorno = 4;
        } else if (giorno.equals("Venerdì")) {
            numeroGiorno = 5;
        } else if (giorno.equals("Sabato")) {
            numeroGiorno = 6;
        } else if (giorno.equals("Domenica")) {
            numeroGiorno = 7;
        } else {
            numeroGiorno = 0; // giorno non valido
        }
        return numeroGiorno;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(Map.of(
                "Lunedì", 1,
                "Martedì", 2,
                "Mercoledì", 3,
                "Giovedì", 4,
                "Venerdì", 5,
                "Sabato", 6,
                "Domenica", 7
        ));

        String giorno = "Mercoledì";
        System.out.println(dayToNumber(giorno));
        System.out.println(map.get(giorno));
    }
}
