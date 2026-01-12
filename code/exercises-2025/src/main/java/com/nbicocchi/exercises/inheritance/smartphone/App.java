package com.nbicocchi.exercises.inheritance.smartphone;

public class App {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(100, null, false);
        smartphone.setNetwork("Aula");
        System.out.println(smartphone);
    }
}
