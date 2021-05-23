package com.company;

public class Main {

    public static void main(String[] args) {

        Human andrzej = new Human("Andrzej", "Kowalski", "CEO");
        Human human = new Human("Homo", "Sapiens", "first human");
        Human baska = new Human("Baśka", "Nowak", "developer");

        Animal fox = new Animal("Lis", "Ssak", false);
        Animal bociek = new Animal("Bocian", "Ptak", true);

        Phone cegla = new Phone("Nokia", "3310", 0.5f, false);
        Phone smart = new Phone("Xiaomi", "Redmi 8T", 6.8f, true);
    }
}