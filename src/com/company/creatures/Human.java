package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Device;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Human extends Animal {

    private Device device;
    private final String firstName;
    private final String lastName;
    private String position;
    private Animal pet;
    private Car car;
    private double salary;
    private BigDecimal cash = BigDecimal.ZERO;

    public Human(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void addCash(BigDecimal toAdd){
        this.cash = this.cash.add(toAdd);
    }

    public void minusCash(BigDecimal toSubstract){
        this.cash = this.cash.subtract(toSubstract);
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Car getCar() {
        System.out.println(this.getFirstName() + " has a car: \n" + car.toString());
        return car;
    }

    public void setCar(Car car) {
        if(this.salary > car.getCarValue()){
            this.car = car;
            System.out.println("You just buy a new car with cash!!!");
        } else if (this.salary > car.getCarValue()/12){
            this.car = car;
            System.out.println("You just buy a new car with credit!!!");
        } else {
            System.out.println("Enroll in studies and find a new job or go for a raise!!!");
        }
    }

    public double getSalary() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(this.salary);
        System.out.println(dateTime);
        return salary;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("The new data has been sent to the accounting system.");
            System.out.println("Collect the annex to the contract from Mrs. Hania from human resources.");
            System.out.println("ZUS and Tax Office already knows about the change in payment and it makes no sense to hide your income.");
        } else
            throw new IllegalArgumentException("You cannot set salary lower than zero");
    }

    @Override
    public void sell(Human seller, Human buyer, double price) {
        throw new UnsupportedOperationException("Human trading is not allowed!!!");
    }

    public String  getFullname() {
        return firstName + " " + lastName;
    }
}