package com.nbicocchi.exercises.lesson9;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("miao");
    }

    public void graffia() {
        System.out.println("Beccati sto graffio");
    }
}
