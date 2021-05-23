package com.company;

public class Animal {

    private String name;
    private boolean canFly;
    private double weight;

    private final Species SPECIES;
    private final double DEFAULT_FISH_WEIGHT = 1.0;
    private final double DEFAULT_DOGS_WEIGHT = 20.6;
    private final double DEFAULT_CATS_WEIGHT = 10.5;
    private final double DEFAULT_HUMANS_WEIGHT = 75.0;
    private final double DEFAULT_BIRDS_WEIGHT = 8.0;


    public Animal() {
        SPECIES = null;
    }

    public Animal(String name, boolean canFly, double weight, Species SPECIES) {
        this.name = name;
        this.canFly = canFly;
        this.weight = weight;
        this.SPECIES = SPECIES;
    }

    public Animal(String name, boolean canFly, Species species) {
        this.name = name;
        this.canFly = canFly;
        this.SPECIES = species;
        this.weight = setDefautWeightBySpecies();
    }

    public static void weightCompare(Animal a1, Animal a2){
        StringBuilder stringBuilder = new StringBuilder("Heavier is: ");
        if(a1.getWeight() > a2.getWeight())
            System.out.println(stringBuilder.append(a1.getName() + " this animal weighs: " + a1.getWeight()) + "kg" + "\n");
        else
            System.out.println(stringBuilder.append(a2.getName() + " this animal weighs: " + a2.getWeight()) + "kg" + "\n");
    }

    private double setDefautWeightBySpecies(){
        switch (SPECIES){
            case CATS:
                weight= DEFAULT_CATS_WEIGHT;
                break;
            case DOGS:
                weight = DEFAULT_DOGS_WEIGHT;
                break;
            case BIRDS:
                weight = DEFAULT_BIRDS_WEIGHT;
                break;
            case FISHES:
                weight = DEFAULT_FISH_WEIGHT;
                break;
            case HUMANS:
                weight = DEFAULT_HUMANS_WEIGHT;
                break;
        }
        return weight;
    }

    public void feed(){
        if (this.getWeight() >= 0) {
            this.setWeight(this.getWeight() + 0.5);
            System.out.println(this.getName() + " is enjoy now after it was fed. It's weight is: " + this.getWeight() + "kg.");
        } else {
            System.out.println("This animal is already dead and you can't feed it!!!");
        }
    }

    public void takeForAWalk(){
        if(this.getWeight() >= 0.5){
            this.setWeight(this.getWeight() - 0.5);
            System.out.println(this.getName() + " is thankful for a walk. It's fit increased and weight decreased and equals: " + this.getWeight() + "kg.");
        } else {
            System.out.println(this.getName() + " is to weak for a walk!!! Feed him first!!!");
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Species getSPECIES() {
        return SPECIES;
    }
}