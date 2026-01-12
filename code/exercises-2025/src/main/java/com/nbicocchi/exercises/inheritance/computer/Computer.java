package com.nbicocchi.exercises.inheritance.computer;

public class Computer {
    Monitor monitor;
    Keyboard keyboard;

    public Computer(Monitor monitor, Keyboard keyboard) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        use();
    }

    public void use() {
        monitor.view();
        keyboard.type();
    }
}
