package com.nbicocchi.exercises.classes;

public class MovingObject {
    Vector2D position;
    Vector2D velocity;

    public MovingObject(Vector2D position, Vector2D velocity) {
        this.position = position;
        this.velocity = velocity;
    }

    public Vector2D getPosition() {
        return position;
    }

    public Vector2D getVelocity() {
        return velocity;
    }

    public void update() {
        position = position.add(velocity);
    }

    @Override
    public String toString() {
        return "MovingObject{" +
                "position=" + position +
                ", velocity=" + velocity +
                '}';
    }

    public static void main(String[] args) {
        MovingObject mo1 = new MovingObject(new Vector2D(0,0), new Vector2D(1,1));
        for (int t = 0; t < 10; t++) {
            mo1.update();
            System.out.println(mo1);
        }
        mo1.getVelocity().setX(2);
        mo1.getVelocity().setY(-1);

        for (int t = 0; t < 10; t++) {
            mo1.update();
            System.out.println(mo1);
        }
    }
}
