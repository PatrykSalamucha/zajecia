package com.company.devices;

public class Phone extends Device {

    private float screenSize;
    private boolean touchScreen;


    public Phone(String producer, String model, int yearOfProduction, float screenSize, boolean touchScreen) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.touchScreen = touchScreen;
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

    @Override
    public void turnOn() {
        System.out.println("Telefon włączony");
    }
}