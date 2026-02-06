package com.nbicocchi.exercises.lesson9;

public class Person {
    private String name;
    protected double balance = 0;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public double getBalance() { return balance; }

    public void receiveGift(double amount) {
        balance += amount > 0 ? amount : 0;
        // if(amount > 0) { return amount; } else { return 0; }
    }

    public void waste(double amount) {
        balance -= amount;
    }

    public static void main(String[] args) {
        Person p0 = new Person("Mirco");
        Worker w0 = new Worker("Lucia", 19000);
        Freelancer f0 = new Freelancer("Gaia");

        p0.receiveGift(1000);
        w0.collectGrossSalary();
        w0.collectGrossSalary();
        w0.collectGrossSalary();

        System.out.println( p0.getBalance() );
        System.out.println( w0.getBalance() );

        w0.payTaxes();
        System.out.println( w0.getBalance() );

        for(int i = 0; i< 10; i++) {
            f0.collectGrossSalary(1e5+1);
            f0.payTaxes();
            f0.waste(85000);
            System.out.println( f0.getBalance() );
        }

    }
}
