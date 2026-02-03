package com.nbicocchi.exercises.lesson8.vehicles;

import java.util.List;

public class Parcheggio {
    double getKmlAvg(List<Veicolo> veicoli) {
        double sum = 0;
        for (Veicolo v : veicoli) {
            sum += v.kml();
        }
        return sum/veicoli.size();
    }
}
