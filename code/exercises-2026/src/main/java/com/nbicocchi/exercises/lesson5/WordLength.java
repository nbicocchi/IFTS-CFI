package com.nbicocchi.exercises.lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordLength {
    public static Map<Integer, List<String>> toMap(List<String> l) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (String s: l) {
            if (map.containsKey(s.length())) {
                map.get(s.length()).add(s);
            } else {
                map.put(s.length(), new ArrayList<>(List.of(s)));
            }
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("nicola");
        l.add("giulia");
        l.add("tre");
        System.out.println(toMap(l));

    }
}
