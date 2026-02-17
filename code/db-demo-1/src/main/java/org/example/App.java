package org.example;

public class App {
    public static void main(String[] args) {
        Repository repository = new DBRepository();
        System.out.println(repository.findAll());
        repository.deleteById(2L);
        System.out.println(repository.findAll());
        repository.save(new Car("Fiat", "Punto"));
        System.out.println(repository.findAll());
    }
}
