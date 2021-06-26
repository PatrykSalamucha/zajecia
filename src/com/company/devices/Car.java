package com.company.devices;

import com.company.CarBrands;

public class Car extends Device{
    private final CarBrands brand;
    private double carValue;

    public Car(CarBrands brand, String model, int buildYear) {
        super(brand.name(), model, buildYear);
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (getYearOfProduction() != car.getYearOfProduction()) return false;
        if (brand != car.brand) return false;
        return getModel().equals(car.getModel());
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + getModel().hashCode();
        result = 31 * result + getYearOfProduction();
        return result;
    }


    public CarBrands getBrand() {
        return brand;
    }

    public double getCarValue() {
        return carValue;
    }

    public void setCarValue(double carValue) {
        this.carValue = carValue;
    }

    @Override
    public void turnOn() {
        System.out.println("Samochód uruchomiony");
    }
}