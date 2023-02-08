package org.example;

public class ElectricVehicle extends Vehicle{

    private int batteryCapacity;
    private int chargeLevel;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public void charge(){

            chargeLevel++;

    }

    public void drive(double miles){

        System.out.println("Electric vehicle driven " +miles+ " miles");

    }

}
