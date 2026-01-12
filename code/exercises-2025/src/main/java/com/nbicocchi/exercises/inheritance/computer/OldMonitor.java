package com.nbicocchi.exercises.inheritance.computer;

public class OldMonitor implements Monitor {
    @Override
    public void view() {
        System.out.println("Old monitor view");
    }
}
