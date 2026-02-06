package com.nbicocchi.exercises.lesson9;

public class Freelancer extends Worker {
    // Le partite iva vengono tassate flat al 5% per i primi 5 anni
    // al 15% dopo
    // come un dipendente se incassano più di 100k

    int activityYears = 0;

    public Freelancer(String name) {
        super(name, 0);
    }

    public void collectGrossSalary(double amount) {
        balance += amount > 0 ? amount : 0;
        taxable += amount > 0 ? amount : 0;
    }

    double incomeThreshold = 1e5;

    public void payTaxes() {
        if(taxable > incomeThreshold) {
            super.payTaxes();
            return;
        }
        double flatTax = 0.15;
        if (activityYears < 5) flatTax = 0.05;

        balance -= taxable * flatTax;
        taxable = 0;
        activityYears++;
    }
}
