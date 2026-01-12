package com.nbicocchi.exercises.inheritance.shape;

import java.awt.*;

public interface Movable {
    /**
     * Moves the object.
     * @param movement the point object as to considered as a translation vector.
     */
    void move(Point movement);
}
