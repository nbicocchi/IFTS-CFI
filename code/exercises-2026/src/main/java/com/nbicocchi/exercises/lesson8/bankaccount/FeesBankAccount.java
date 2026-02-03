package com.nbicocchi.exercises.lesson8.bankaccount;

public class FeesBankAccount extends AbstractBankAccount {
    final double FEE = 1;

    public FeesBankAccount(String id, double balance) {
        super(id, balance);
    }

    @Override
    public double withdraw(double amount) {
        balance -= FEE;
        return super.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        balance -= FEE;
        super.deposit(amount);
    }
}
