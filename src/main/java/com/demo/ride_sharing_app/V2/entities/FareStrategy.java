package com.demo.ride_sharing_app.V2.entities;

public interface FareStrategy {

    double calcFare(Vehicle vehicle, double distance);
}

