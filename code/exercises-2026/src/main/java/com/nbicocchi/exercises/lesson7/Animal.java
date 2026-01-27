package com.nbicocchi.exercises.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("Questo animale fa un verso generico");
    }

    public static void main(String[] args) {
        List<Animal> l = new ArrayList<>();
        l.add(new Animal("a"));
        l.add(new Cat("ciccio"));
        l.add(new Dog("cane"));

        for (Animal a : l) {
            a.say();
        }
        



    }
}
