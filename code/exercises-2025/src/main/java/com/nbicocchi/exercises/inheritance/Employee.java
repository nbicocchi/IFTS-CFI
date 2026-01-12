package com.nbicocchi.exercises.inheritance;

public class Employee extends Person {
    double salary;

    public Employee(String name, String lastname, double salary) {
        super(name, lastname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1  = new Person("Mario", "Rossi");
        p1.lastname = "Mario2";
        Employee employee = new Employee("John", "Smith", 50000);
        employee.lastname = "John2";
        System.out.println(employee.toString());
    }
}
