package org.example;

public class Main {
    public static void main(String[] args) {

    Car car = new Car();
    ElectricVehicle electricVehicle = new ElectricVehicle();
    Truck truck = new Truck();

    car.start();
    car.stop();
    car.drive(2);
    car.honk();
    car.openTrunk();

    electricVehicle.charge();
    electricVehicle.drive(200);

    truck.load(3.9);

    }
}