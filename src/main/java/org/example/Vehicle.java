package org.example;

public class Vehicle extends Engine implements Honkable{

    private String make;
    private int model;
    private int year;
    private String color;
    private int numberOfWheels;
    private double weight;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void start(){

      System.out.println("Vehicle started.");
    }

    public void stop(){

        System.out.println("Vehicle stopped.");

    }

    public void drive(double miles){

        System.out.println("Vehicle driven "+miles+ " miles.");

    }

    public void honk(){

        System.out.println("Honk Honk!");

    }


    @Override
    public void startEngine() {
        System.out.println("Engine started.");
    }
}
