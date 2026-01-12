package com.nbicocchi.exercises.inheritance.payment;

public class CreditCardPayment implements Payment {
    String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("payment from card " + cardNumber);
    }
}
