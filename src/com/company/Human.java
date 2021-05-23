package com.company;

import com.company.devices.Car;

import java.time.LocalDateTime;

public class Human {

    private String firstName;
    private String lastName;
    private String position;
    private Animal pet;
    private Car car;
    private double salary;

    public Human(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public Human() {
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("The new data has been sent to the accounting system.");
            System.out.println("Collect the annex to the contract from Mrs. Hania from human resources.");
            System.out.println("ZUS and Tax Office already knows about the change in payment and it makes no sense to hide your income.");
        } else {
        }
    }
}