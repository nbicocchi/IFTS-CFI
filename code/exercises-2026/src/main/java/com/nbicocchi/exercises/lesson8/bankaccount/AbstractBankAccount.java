package com.nbicocchi.exercises.lesson8.bankaccount;

public abstract class AbstractBankAccount implements BankAccount {
    String id;
    double balance;

    public AbstractBankAccount(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public double withdraw(double amount) {
        balance -= amount;
        return amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }
}
