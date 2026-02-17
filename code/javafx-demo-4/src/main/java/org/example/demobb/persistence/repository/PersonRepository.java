package org.example.demobb.persistence.repository;


import org.example.demobb.persistence.model.Person;

import java.util.*;

public class PersonRepository implements Repository {
    List<Person> persons;

    public PersonRepository() {
        persons = new ArrayList<>();
    }

    @Override
    public Optional<Person> findById(Long id) {
        for (Person person : persons) {
            if (person.getId().equals(id)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    @Override
    public Iterable<Person> findAll() {
        return persons;
    }

    @Override
    public Person save(Person entity) {
        System.out.println(persons);
        if (Objects.isNull(entity.getId())) {
            return insert(entity);
        }

        Optional<Person> person = findById(entity.getId());
        if (person.isEmpty()) {
            return insert(entity);
        } else {
            return update(entity);
        }
    }

    private Person insert(Person entity) {
        Random random = new Random();
        entity.setId(random.nextLong());
        persons.add(entity);
        return entity;
    }

    private Person update(Person entity) {
        persons.set(persons.indexOf(entity), entity);
        return entity;
    }

    @Override
    public void delete(Person entity) {
        persons.remove(entity);
    }

    @Override
    public void deleteById(Long id) {
        persons.remove(findById(id));
    }

    @Override
    public void deleteAll() {
        persons.clear();
    }
}
