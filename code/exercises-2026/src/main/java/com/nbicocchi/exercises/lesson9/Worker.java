package com.nbicocchi.exercises.lesson9;

public class Worker extends Person {

    private double salary;
    protected double taxable;

    public Worker(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void collectGrossSalary() {
        balance += salary;
        taxable += salary;
    }

    public double getSalary() {
        return salary;
    }

    private double[] taxRate = { 0.23, 0.33, 0.43 };
    private double[] taxBracket = { 0, 28000, 50000 };

    public void payTaxes() {
        double tax = 0;

        // fino a 28k pago 23%, solo sull'eccedenza pago il 33% fino a 50k, poi sul'eccedenza il 43%
        for(int i = taxBracket.length - 1; i >= 0; i--) {
            if( taxable > taxBracket[i] ) {
                double tmp = taxable - taxBracket[i]; // sempre positivo
                double payed = tmp * taxRate[i];
                tax += payed;
                taxable = taxBracket[i];

                //System.out.println("Hai pagato " + payed + " con aliquota " + taxRate[i] + " su " + tmp);
            }
        }
        balance -= tax;

        //System.out.println("Tasse pagate: " + tax);
    }
}
