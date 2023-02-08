package org.example;

public class Truck extends Vehicle{

    private int numberOfAxles;
    private int capacityInTons;

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public int getCapacityInTons() {
        return capacityInTons;
    }

    public void setCapacityInTons(int capacityInTons) {
        this.capacityInTons = capacityInTons;
    }

    public void load(double weight){
        System.out.println("Loaded "+weight+" tons.");
    }
}
