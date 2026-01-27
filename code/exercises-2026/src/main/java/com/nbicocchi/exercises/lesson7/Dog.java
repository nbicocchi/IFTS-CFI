package com.nbicocchi.exercises.lesson7;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("bau");
    }
}
