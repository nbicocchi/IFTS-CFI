package com.nbicocchi.exercises.inheritance.smartphone;

public class Smartphone implements Chargeable, Connectable {
    int batteryLevel;
    String network;
    boolean isConnected;

    public Smartphone(int batteryLevel, String network, boolean isConnected) {
        this.batteryLevel = batteryLevel;
        this.network = network;
        this.isConnected = isConnected;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
        this.isConnected = true;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    @Override
    public void charge(int percentage) {
        batteryLevel = percentage;
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void connectToNetwork(String networkName) {
        network = networkName;
        isConnected = true;
    }

    @Override
    public boolean isConnected() {
        return isConnected;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "batteryLevel=" + batteryLevel +
                ", network='" + network + '\'' +
                ", isConnected=" + isConnected +
                '}';
    }
}
