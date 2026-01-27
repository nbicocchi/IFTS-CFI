package com.nbicocchi.exercises.lesson6;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // push back
        // ArrayList<Integer> elenco = new ArrayList<Integer>();
        LinkedList<Integer> elenco = new LinkedList<Integer>();

        //PushBack(elenco);
        PushFront(elenco);

        System.out.println( elenco.get(777) );

        TreeSet<Integer> tree = new TreeSet<>();


    }

    public static void PushBack(Collection<Integer> elenco) {
        for(int i = 0; i < 1e8; i++) {
            elenco.add(i);
        }
    }

    public static void PushFront(List<Integer> elenco) {
        for(int i = 0; i < 1e6; i++) {
            elenco.addFirst(i);
        }
    }

    public static void PushInTheMiddle(List<Integer> elenco) {
        for(int i = 0; i < 1e6; i++) {
            int pos = i / 2;
            elenco.add(pos, i);
        }
    }
}
