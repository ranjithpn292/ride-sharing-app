package com.demo.ride_sharing_app.V2.entities;

public class Bike extends Vehicle {
    public Bike(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public double getFatePerKm() {
        return 10;
    }
}
