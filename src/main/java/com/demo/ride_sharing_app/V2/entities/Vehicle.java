package com.demo.ride_sharing_app.V2.entities;

abstract public class Vehicle {
    protected String numberPlate;

    public Vehicle(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public abstract double getFatePerKm();
}
