package com.nbicocchi.exercises.classes;

import java.util.Scanner;

public class NumberAggregator {
    double sum;
    double product;

    public NumberAggregator() {
        sum = 0;
        product = 1;
    }

    public double getSum() {
        return sum;
    }

    public double getProduct() {
        return product;
    }

    public void addNumber(double n) {
        sum += n;
        product *= n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberAggregator aggregator = new NumberAggregator();
        while (true) {
            double n = scanner.nextDouble();
            if (n == 0) {
                break;
            }
            aggregator.addNumber(n);
        }
        System.out.println(aggregator.getSum());
        System.out.println(aggregator.getProduct());
    }
}
