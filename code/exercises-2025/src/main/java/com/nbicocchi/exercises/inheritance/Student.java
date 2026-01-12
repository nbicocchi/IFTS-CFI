package com.nbicocchi.exercises.inheritance;

import java.time.LocalDate;

public class Student extends Person {
    String title;
    LocalDate birthDate;

    public Student(String name, String lastname, String title, LocalDate birthDate) {
        super(name, lastname);
        this.title = title;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "title='" + title + '\'' +
                ", birthDate=" + birthDate +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
