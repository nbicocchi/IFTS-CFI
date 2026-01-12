package com.nbicocchi.exercises.inheritance;

public class Teacher extends Person {
    String subject;
    double salary;

    public Teacher(String name, String lastname, String subject, double salary) {
        super(name, lastname);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
