package com.demo.ride_sharing_app.V2.entities;

public class LuxuryFareStrategy implements FareStrategy{
   // 50% more
    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFatePerKm()*distance*1.5;
    }
}
