package com.nbicocchi.exercises.classes;

import java.util.Objects;

public class Car {
    double cylinders;
    double cc;
    double cv;
    double torque;
    boolean automatic;
    String licencePlate;

    public Car(double cylinders, double cc, double cv, double torque, boolean automatic, String licencePlate) {
        this.cylinders = cylinders;
        this.cc = cc;
        this.cv = cv;
        this.torque = torque;
        this.automatic = automatic;
        setLicencePlate(licencePlate);
    }

    public double getCylinders() {
        return cylinders;
    }

    public void setCylinders(double cylinders) {
        this.cylinders = cylinders;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public double getCv() {
        return cv;
    }

    public void setCv(double cv) {
        this.cv = cv;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        if (licencePlate.length() != 7) {
            throw new IllegalArgumentException("Licence plate length must be 7");
        }
        if (!Character.isLetter(licencePlate.charAt(0)) ||
                !Character.isLetter(licencePlate.charAt(1))||
                !Character.isLetter(licencePlate.charAt(5))||
                !Character.isLetter(licencePlate.charAt(6))) {
            throw new IllegalArgumentException("Licence plate invalid");
        }
        if (!Character.isDigit(licencePlate.charAt(2)) ||
                !Character.isDigit(licencePlate.charAt(3))||
                !Character.isDigit(licencePlate.charAt(4))) {
            throw new IllegalArgumentException("Licence plate invalid");
        }
        this.licencePlate = licencePlate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(cylinders, car.cylinders) == 0 && Double.compare(cc, car.cc) == 0 && Double.compare(cv, car.cv) == 0 && Double.compare(torque, car.torque) == 0 && automatic == car.automatic && Objects.equals(licencePlate, car.licencePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, cc, cv, torque, automatic, licencePlate);
    }

    @Override
    public String toString() {
        return "Car{" +
                "cylinders=" + cylinders +
                ", cc=" + cc +
                ", cv=" + cv +
                ", torque=" + torque +
                ", automatic=" + automatic +
                ", licencePlate='" + licencePlate + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car c1 = new Car(4.0, 2000.0, 200.0, 200.0, false, "AA233BB");
        Car c2 = new Car(4.0, 2000.0, 200.0, 200.0, false, "AA123BB");
    }
}
