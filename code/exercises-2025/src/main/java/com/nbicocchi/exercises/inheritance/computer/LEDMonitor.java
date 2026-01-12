package com.nbicocchi.exercises.inheritance.computer;

public class LEDMonitor implements Monitor {
    @Override
    public void view() {
        System.out.println("LED monitor view");
    }
}
