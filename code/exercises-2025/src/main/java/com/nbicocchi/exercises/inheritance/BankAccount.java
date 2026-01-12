package com.nbicocchi.exercises.inheritance;

public class BankAccount {
    String IBAN;
    String owner;
    double balance;
    double interestRate;

    public BankAccount(String IBAN, String owner, double balance, double interestRate) {
        this.IBAN = IBAN;
        this.owner = owner;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public BankAccount(String IBAN, String owner) {
        this.IBAN = IBAN;
        this.owner = owner;
        this.balance = 0.0;
        this.interestRate = 0.03;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    public double wire(double amount, BankAccount otherAccount) {
        withdraw(amount);
        otherAccount.deposit(amount);
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "IBAN='" + IBAN + '\'' +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("IT123", "ABC");
        account.deposit(10);
        account.withdraw(20);

    }
}
