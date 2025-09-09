package com.demo.ride_sharing_app.V1.services;
import com.demo.ride_sharing_app.V1.entities.Driver;
import com.demo.ride_sharing_app.V1.entities.Location;
import com.demo.ride_sharing_app.V1.entities.Passenger;
import com.demo.ride_sharing_app.V1.entities.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class RideSharingAppService {
    private List<Driver> drivers = new ArrayList<>();
    private List<Passenger> passengers = new ArrayList<>();

    // method to add drivers and passenger

    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    //Booking rider
    public void bookRide(Passenger passenger, double distance){
        // if no drivers available
        if(drivers.isEmpty()){
            System.out.println("No drtivers available for ::" + passenger.getName());
            return;
        }

        Driver assignedDriver = null;
        double minDistance = Double.MAX_VALUE;

        for(Driver driver: drivers){
            double currentDriverdistance = calcDistance(passenger.getLocation(),driver.getLocation());
            if(currentDriverdistance < minDistance){
                minDistance = currentDriverdistance;
                assignedDriver = driver;
            }
        }

        // calculate the fare
        double expectedFare = calcFare(assignedDriver.getVehicle(), distance);

        // Track the driver state - BOOKED/AVAILABLE

        // show the driver and fare to the passenger
        System.out.println("Ride booked for "+passenger.getName()+" with driver "
                + assignedDriver.getName() + " with fare " + expectedFare);
        System.out.println("Your driver is on the way " + passenger.getName());

    }

    private static double calcFare(Vehicle vehicle, double distance){
        if(vehicle.getType().equals("Car")){
            return distance*20;
        }
        if(vehicle.getType().equals("Bike")){
            return distance*10;
        }

        return distance*8;

    }

    private static double calcDistance(Location one, Location two){
        // Euclidean distance
        double dx= one.getLatitude() - two.getLatitude();
        double dy= one.getLongitude() - two.getLongitude();

        return Math.sqrt(dx*dx + dy*dy);
    }


}

