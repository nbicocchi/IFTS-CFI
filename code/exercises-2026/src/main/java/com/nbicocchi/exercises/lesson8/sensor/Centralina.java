package com.nbicocchi.exercises.lesson8.sensor;

import java.util.List;

public class Centralina {
    public void saveInCloud(List<Sensor> l) {
        for (Sensor s : l) {
            System.out.println(s);
        }
    }
}
