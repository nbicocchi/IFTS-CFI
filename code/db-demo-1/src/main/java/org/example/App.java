package org.example;

public class App {
    public static void main(String[] args) {
        Repository repository = new DBRepository();
        System.out.println(repository.findAll());
    }
}
