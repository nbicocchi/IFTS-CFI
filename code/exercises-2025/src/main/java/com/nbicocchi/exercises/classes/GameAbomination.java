package com.nbicocchi.exercises.classes;

import java.util.Scanner;

public class GameAbomination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyPoint myPoint = new MyPoint(0,0);
        while(true) {
            char key = scanner.next().charAt(0);
            switch (key) {
                case 'w' -> myPoint.moveUp();
                case 'a' -> myPoint.moveLeft();
                case 's' -> myPoint.moveDown();
                case 'd' -> myPoint.moveRight();
            }

            System.out.println(myPoint);
        }
    }
}
