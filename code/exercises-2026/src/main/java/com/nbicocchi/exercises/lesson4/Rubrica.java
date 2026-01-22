package com.nbicocchi.exercises.lesson4;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {
    public static void main(String[] args) {
        Map<String, String> rubrica = new HashMap<>();
        rubrica.put("marco", "+39434435");
        rubrica.put("paola", "+39434466");
        rubrica.put("luigi", "+39434488");

        System.out.println(rubrica.get("paola"));
    }
}
