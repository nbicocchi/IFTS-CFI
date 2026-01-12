package com.nbicocchi.exercises.inheritance.payment;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<>(List.of(
                new CreditCardPayment("0000-1111-2222-3333"),
                new PayPalPayment("nbicocchi@gmail.com")
        ));

        for (Payment payment : payments) {
            payment.processPayment(100);
        }
    }
}
