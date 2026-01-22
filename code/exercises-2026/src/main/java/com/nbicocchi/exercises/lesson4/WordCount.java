package com.nbicocchi.exercises.lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public static Map<String, Integer> toMap(List<String> l) {
        Map<String, Integer> map = new HashMap<>();
        for (String s: l) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("nicola");
        l.add("giulia");
        l.add("tre");
        l.add("tre");
        System.out.println(toMap(l));

    }
}
