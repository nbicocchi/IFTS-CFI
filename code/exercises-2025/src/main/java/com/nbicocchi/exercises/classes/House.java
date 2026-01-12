package com.nbicocchi.exercises.classes;

import java.util.Objects;

public class House {
    String type;
    String address;
    String energyClass;
    double mq;
    int rooms;
    int bathrooms;

    public House(String type, String address, String energyClass, double mq, int rooms, int bathrooms) {
        this.type = type;
        this.address = address;
        this.energyClass = energyClass;
        this.mq = mq;
        this.rooms = rooms;
        this.bathrooms = bathrooms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }

    public double getMq() {
        return mq;
    }

    public void setMq(double mq) {
        this.mq = mq;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Double.compare(mq, house.mq) == 0 && rooms == house.rooms && bathrooms == house.bathrooms && Objects.equals(type, house.type) && Objects.equals(address, house.address) && Objects.equals(energyClass, house.energyClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, address, energyClass, mq, rooms, bathrooms);
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", energyClass='" + energyClass + '\'' +
                ", mq=" + mq +
                ", rooms=" + rooms +
                ", bathrooms=" + bathrooms +
                '}';
    }

    public static void main(String[] args) {
        House h1 = new House("Apartment", "via Roma 2", "B", 120, 5, 2);
        House h2 = new House("Apartment", "via Roma 2", "B", 120, 5, 2);
        House h3 = new House("Apartment", "via Roma 3", "B", 120, 5, 2);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));

        h3.setAddress("via Roma 2");
        System.out.println(h1.equals(h3));
    }
}
