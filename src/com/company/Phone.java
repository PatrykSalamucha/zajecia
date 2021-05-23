package com.company;

public class Phone {

    String brand;
    String model;
    float screenSize;
    boolean touchScreen;

    public Phone() {
    }

    public Phone(String brand, String model, float screenSize, boolean touchScreen) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.touchScreen = touchScreen;
    }
}