package com.company.devices;

public class Phone {

    private String brand;
    private String model;
    private float screenSize;
    private boolean touchScreen;

    public Phone() {
    }

    public Phone(String brand, String model, float screenSize, boolean touchScreen) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.touchScreen = touchScreen;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", touchScreen=" + touchScreen +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }
}