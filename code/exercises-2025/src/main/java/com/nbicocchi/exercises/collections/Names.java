package com.nbicocchi.exercises.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.nbicocchi.exercises.classes.Person;


public class Names {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ciccio", "Pasticcio", LocalDate.of(2000,1,1)));
        people.add(new Person("Gino", "Pilotino", LocalDate.of(2002,2,2)));
        people.add(new Person("Ada", "Zanzibar", LocalDate.of(1999,11,11)));
        Collections.sort(people);
        System.out.println(people);

    }

}
