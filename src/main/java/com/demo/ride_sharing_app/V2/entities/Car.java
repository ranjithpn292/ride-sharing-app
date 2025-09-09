package com.demo.ride_sharing_app.V2.entities;

import com.demo.ride_sharing_app.V2.entities.Vehicle;

public class Car extends Vehicle {
    public Car(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public double getFatePerKm() {
        return 20;
    }
}
