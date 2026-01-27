package com.nbicocchi.exercises.lesson7;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("miao");
    }
}
