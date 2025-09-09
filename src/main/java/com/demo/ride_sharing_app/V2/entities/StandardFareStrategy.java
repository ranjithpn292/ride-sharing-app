package com.demo.ride_sharing_app.V2.entities;

public class StandardFareStrategy implements FareStrategy{

    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFatePerKm()*distance;
    }
}
