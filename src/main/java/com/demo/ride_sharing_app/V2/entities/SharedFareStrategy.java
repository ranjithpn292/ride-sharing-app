package com.demo.ride_sharing_app.V2.entities;

public class SharedFareStrategy implements FareStrategy{
   // 50% off
    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFatePerKm()*distance*.5;
    }
}
