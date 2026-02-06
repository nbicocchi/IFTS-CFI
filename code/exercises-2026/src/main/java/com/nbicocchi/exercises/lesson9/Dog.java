package com.nbicocchi.exercises.lesson9;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("bau");
    }

    public void obbedire() {
        System.out.println("Ecco la zampa!");
    }
}
