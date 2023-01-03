package org.example;

public class Car {

    private String brand;
    private int door;

    public Car(String brand, int door) {
        this.brand = brand;
        this.door = door;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }
}

