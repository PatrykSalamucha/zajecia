package com.company.devices;

import com.company.CarBrands;

public class Car {
    private final CarBrands brand;
    private final String model;
    private int buildYear;
    private double carValue;

    public Car(CarBrands brand, String model, int buildYear) {
        this.brand = brand;
        this.model = model;
        this.buildYear = buildYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (buildYear != car.buildYear) return false;
        if (brand != car.brand) return false;
        return model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + buildYear;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", buildYear=" + buildYear +
                ", carValue=" + carValue +
                '}';
    }

    public CarBrands getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public double getCarValue() {
        return carValue;
    }

    public void setCarValue(double carValue) {
        this.carValue = carValue;
    }
}