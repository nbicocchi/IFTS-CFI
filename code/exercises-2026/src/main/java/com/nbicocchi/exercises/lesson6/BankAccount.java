package org.example;

public class BankAccount {

    /*
    * Crea una classe che gestisca prelievi, depositi, acquisti
    * per conti correnti.
    * */

    private double balance = 0;
    private String holder;

    public BankAccount(String holder) {
        this.holder = holder;
    }

    public BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void Deposit(double amount) {
        if(amount < 0) {
            System.out.println("ERRORE");
        }
        else {
            balance += amount;
        }
    }

    public void Withdraw(double amount) {
        if(amount < 0)
            System.out.println("ERRORE");
        else if (amount > balance)
            System.out.println("FONDI INSUFFICIENTI");
        else
            balance -= amount;
    }

    // una persona possa inviare tramite bonifico ad una seconda persona
    public void WireTransfer(BankAccount other, double amount) {
        if(amount < 0)
            System.out.println("ERRORE");
        else if (amount > balance)
            System.out.println("FONDI INSUFFICIENTI");
        else {
            this.balance -= amount;
            other.balance += amount;
        }
    }

    public String toString() {
        return holder + " " + balance;
    }

    public static void main(String[] args) {
        BankAccount persona1 = new BankAccount("Riccardo");
        BankAccount persona2 = new BankAccount("Eva", 19000);

        persona1.Deposit(10000);
        persona2.Deposit(700);

        persona2.Withdraw(-600000);
        persona2.Deposit(-50000);

        persona1.Withdraw(15000);

        persona1.WireTransfer(persona2, 9000);

        System.out.println( persona1 );
        System.out.println( persona2 );
    }
}
