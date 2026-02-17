package org.example.demobb.persistence.repository;


import org.example.demobb.persistence.model.Person;

import java.util.Optional;

public class PersonRepository implements Repository {


    @Override
    public Optional<Person> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Person> findAll() {
        return null;
    }

    @Override
    public Person save(Person entity) {
        return null;
    }

    @Override
    public void delete(Person entity) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteAll() {

    }
}
