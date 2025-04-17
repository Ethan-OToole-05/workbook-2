package com.pluralsight;

import java.util.Vector;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;
    public Vehicle() {
        this.vehicleId = 0;
        this.makeModel = "";
        this.color = "";
        this.odometerReading = 0;
        this.price = 0.0f;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void display(Vehicle vehicle) {
        System.out.println("Vehicle ID: " + this.vehicleId);
        System.out.println("Make Model: " + this.makeModel);
        System.out.println("Color: " + this.color);
        System.out.println("Odometer Reading: " + this.odometerReading);
        System.out.println("Price: " + this.price);
    }

}

