package org.example.demobb.persistence.repository;

import org.example.demobb.persistence.model.Person;

import java.util.Optional;

public interface Repository {
    Optional<Person> findById(Long id);
    Iterable<Person> findAll();
    Person save(Person entity);
    void delete(Person entity);
    void deleteById(Long id);
    void deleteAll();
}
