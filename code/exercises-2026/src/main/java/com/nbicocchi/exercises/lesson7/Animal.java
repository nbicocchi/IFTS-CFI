package com.nbicocchi.exercises.lesson7;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("Questo animale fa un verso generico");
    }

    public static void main(String[] args) {
        Animal a = new Animal("generico");
        a.say();
        Cat b = new Cat("ciccio");
        b.say();
    }
}
