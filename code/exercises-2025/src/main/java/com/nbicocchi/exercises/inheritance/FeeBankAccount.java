package com.nbicocchi.exercises.inheritance;

public class FeeBankAccount extends BankAccount {
    final double fee = 1;
    public FeeBankAccount(String IBAN, String owner, double balance, double interestRate) {
        super(IBAN, owner, balance, interestRate);
    }

    public FeeBankAccount(String IBAN, String owner) {
        super(IBAN, owner);
    }

    public double deposit(double amount) {
        balance -= fee;
        return super.deposit(amount);
    }

    public double withdraw(double amount) {
        balance -= fee;
        return super.withdraw(amount);
    }

    public static void main(String[] args) {
        BankAccount ba1 = new FeeBankAccount("IT123", "Owner 1");
        BankAccount ba2 = new FeeBankAccount("US123", "Owner 2");
        ba1.wire(1000, ba2);
        ba2.wire(1000, ba1);
        System.out.println(ba1);
        System.out.println(ba2);
    }
}
