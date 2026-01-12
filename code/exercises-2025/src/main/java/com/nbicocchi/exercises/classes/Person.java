package com.nbicocchi.exercises.classes;

import java.time.LocalDate;

public class Person implements Comparable<Person> {
    String name;
    String lastname;
    LocalDate birthday;

    public Person(String name, String lastname, LocalDate birthday) {
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getFullName() {
        return name + " " + lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Person other) {
        return this.getLastname().compareTo(other.getLastname());
    }

    public static void main(String[] args) {
        Person p1 = new Person(
                "John",
                "Doe",
                LocalDate.of(1990, 1, 1));
        Person p2 = new Person(
                "Mario",
                "Rossi",
                LocalDate.of(2000, 1, 1));

        System.out.println(p1.name + " " + p1.lastname);
        System.out.println(p2.getFullName());
    }


}
