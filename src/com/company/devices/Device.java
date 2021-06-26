package com.company.devices;

import com.company.creatures.Human;
import com.company.Sellable;

import java.math.BigDecimal;

public abstract class Device implements Sellable {
    private final String producer;
    private final String model;
    private final int yearOfProduction;

    public Device(String producer, String model, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public void sell(Human seller, Human buyer, double price) {
        if(seller.getDevice() == null || seller.getDevice() != this)
            throw new IllegalStateException("Seller doesn't have this device");
        final BigDecimal money = BigDecimal.valueOf(price);
        if(buyer.getCash().compareTo(money) < 0)
            throw new IllegalStateException("Buyer doesn't have enough money");
        seller.setDevice(null);
        buyer.setDevice(this);
        buyer.minusCash(money);
        seller.addCash(money);
        System.out.printf("%s sprzedał urządzenie użytkownikowi %s za %f zł.\n", seller.getFullname(), buyer.getFullname(), price);

    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
