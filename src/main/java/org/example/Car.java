package org.example;

public class Car extends Vehicle{

    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void openTrunk(){
        System.out.println("Trunk opened.");
    }
}
