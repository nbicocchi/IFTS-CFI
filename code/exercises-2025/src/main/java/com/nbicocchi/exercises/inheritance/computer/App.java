package com.nbicocchi.exercises.inheritance.computer;

public class App {
    public static void main(String[] args) {
        Computer c = new Computer(
                new OldMonitor(),
                new OldKeyboard()
        );
    }
}
