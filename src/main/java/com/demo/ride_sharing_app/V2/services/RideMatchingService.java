package com.demo.ride_sharing_app.V2.services;

import com.demo.ride_sharing_app.V2.entities.*;

import java.util.ArrayList;
import java.util.List;

public class RideMatchingService {

    private List<Driver> availableDrivers = new ArrayList<>();

    public void addDriver(Driver driver){
        availableDrivers.add(driver);
    }

    public void requestRide(Passenger passenger, double distance, FareStrategy fareStrategy){
        if(availableDrivers.isEmpty()){
            // mechanism to notify passengers
            passenger.notify("No available drivers for:: " + passenger.getName());
        }

        Driver nearestDriver = findNearestDriver(passenger.getLocation());

        // mediator
        availableDrivers.remove(nearestDriver);
        //passenger.notify("Ride scheduled successfully");
        Ride ride = new Ride(passenger, nearestDriver, distance, fareStrategy);
        // calc fare
        ride.calcFare();

        passenger.notify("Ride scheduled with Rs:"+ride.getFare());
        nearestDriver.notify("You have a new ride request Rs:"+ride.getFare());

        // change the status of the ride
        ride.updateStatus(RideStatus.ONGOING);

        //change the status of driver after ride is finished
        ride.updateStatus(RideStatus.COMPLETED);


        availableDrivers.add(nearestDriver);
        return;
    }

    private Driver findNearestDriver(Location location) {
        Driver assignedDriver = null;
        double minDist = Double.MAX_VALUE;
        for(Driver driver: availableDrivers){
            double dist = location.calcDistance(location);
            if(dist < minDist){
                minDist = dist;
                assignedDriver = driver;
            }
        }
        return assignedDriver;
    }
}
