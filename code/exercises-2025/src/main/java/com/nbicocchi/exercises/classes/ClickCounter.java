package com.nbicocchi.exercises.classes;

public class ClickCounter {
    int value;

    public ClickCounter() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void click() {
        this.value++;
    }

    public void undo() {
        this.value--;
        if (this.value < 0) {
            this.value = 0;
        }
    }

    public void reset() {
        this.value = 0;
    }
}
