package com.nbicocchi.exercises.lesson10;

public class App {
    public static void main(String[] args) {
        Repository repository = new MemoryRepository();
        repository.save(new Car("fiat","punto"));
        repository.save(new Car("fiat","regata"));
        System.out.println(repository.findAll());
        repository.delete(new Car(1L, "fiat","regata"));
        System.out.println(repository.findAll());
        repository.deleteAll();
        System.out.println(repository.findAll());
    }
}
