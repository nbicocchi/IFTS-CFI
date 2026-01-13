package com.nbicocchi.exercises.lesson1;

public class NameCheck {

    public static boolean isOK(String name) {
        if ((name.length() < 6) || (name.equals("nicola"))) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String name = "niaefrfwer";
        if (isOK(name)) {
            System.out.println("è OK");
        } else {
            System.out.println("non è OK");
        }
    }
}
