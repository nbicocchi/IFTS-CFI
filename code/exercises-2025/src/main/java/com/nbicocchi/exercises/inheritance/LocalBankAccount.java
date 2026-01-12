package com.nbicocchi.exercises.inheritance;

public class LocalBankAccount extends BankAccount {
    public LocalBankAccount(String IBAN, String owner, double balance, double interestRate) {
        super(IBAN, owner, balance, interestRate);
    }

    public LocalBankAccount(String IBAN, String owner) {
        super(IBAN, owner);
    }

    public double wire(double amount, BankAccount otherAccount) {
        if (!IBAN.substring(0, 2).equals(otherAccount.getIBAN().substring(0, 2))) {
            throw new IllegalArgumentException("IBAN not local");
        }
        withdraw(amount);
        otherAccount.deposit(amount);
        return balance;
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("IT123", "Owner 1");
        BankAccount ba2 = new LocalBankAccount("US123", "Owner 2");
        ba1.wire(1000, ba2);
        ba2.wire(1000, ba1);
        System.out.println(ba1);
        System.out.println(ba2);
    }
}
