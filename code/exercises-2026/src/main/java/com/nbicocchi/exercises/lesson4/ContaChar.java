package com.nbicocchi.exercises.lesson4;

import java.util.*;

public class ContaChar {
    public static Map<Character, Integer> stringToMap(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            int v = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), v + 1);
        }
        return map;
    }
    public static void main(String[] args) {
        String s = "ciao mondo!";
        System.out.println(stringToMap(s));
    }
}
