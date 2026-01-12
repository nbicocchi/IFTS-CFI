package com.nbicocchi.exercises.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClickCounterTest {

    @Test
    void getValue() {
        ClickCounter clickCounter = new ClickCounter();
        assertEquals(0, clickCounter.getValue());
        clickCounter.click();
        assertEquals(1, clickCounter.getValue());
    }

    @Test
    void click() {
        ClickCounter clickCounter = new ClickCounter();
        clickCounter.click();
        assertEquals(1, clickCounter.getValue());
    }

    @Test
    void undo() {
        ClickCounter clickCounter = new ClickCounter();
        clickCounter.click();
        clickCounter.undo();
        assertEquals(0, clickCounter.getValue());
        clickCounter.undo();
        assertEquals(0, clickCounter.getValue());
    }

    @Test
    void reset() {
        ClickCounter clickCounter = new ClickCounter();
        clickCounter.click();
        clickCounter.reset();
        assertEquals(0, clickCounter.getValue());
    }
}