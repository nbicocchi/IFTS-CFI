package com.nbicocchi.exercises.inheritance.payment;

public class PayPalPayment implements Payment {
    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("payment from card " + email);
    }
}
