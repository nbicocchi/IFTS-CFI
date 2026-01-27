package com.nbicocchi.exercises.lesson7;

public class Computer {
    String code;
    String location;
    int gbRam;
    int storage;

    public Computer(String code, String location, int gbRam, int storage) {
        this.code = code;
        this.location = location;
        this.gbRam = gbRam;
        this.storage = storage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getGbRam() {
        return gbRam;
    }

    public void setGbRam(int gbRam) {
        this.gbRam = gbRam;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "code='" + code + '\'' +
                ", location='" + location + '\'' +
                ", gbRam=" + gbRam +
                ", storage=" + storage +
                '}';
    }
}
