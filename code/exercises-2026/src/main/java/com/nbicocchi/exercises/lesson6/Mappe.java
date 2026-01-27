package com.nbicocchi.exercises.lesson6;

import java.util.HashMap;
import java.util.TreeMap;

public class Mappe {
    public static void main(String[] args) {
        TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
        tree.put(1, "Sommer");
        tree.put(2, "De Sciglio");
        tree.put(3, "Grosso");
        tree.put(10, "Messi");

        System.out.println( tree.get(10) );

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.putAll(tree);

        System.out.println( map.get(3) );
    }
}
