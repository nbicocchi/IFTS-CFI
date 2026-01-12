package com.nbicocchi.exercises.inheritance;

import java.time.LocalDate;

public class Person {
    String name;
    String lastname;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Person() {
        this("John", "Doe");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
