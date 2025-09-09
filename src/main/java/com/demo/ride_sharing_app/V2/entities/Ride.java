package com.demo.ride_sharing_app.V2.entities;


import lombok.Getter;


public class Ride {

   private Passenger passenger;

   private Driver driver;

   private double distance;

   private FareStrategy fareStrategy;

   @Getter
   private double fare;

   private RideStatus rideStatus;

   public Ride(Passenger passenger, Driver driver, double distance, FareStrategy fareStrategy){
       this.passenger = passenger;
       this.driver = driver;
       this.distance = distance;
       this.fareStrategy = fareStrategy;
       this.rideStatus = RideStatus.SCHEDULED;
   }

   public void calcFare(){
       this.fare =  fareStrategy.calcFare(driver.getVehicle(), distance);
   }

   public void updateStatus(RideStatus rideStatus){
       this.rideStatus = rideStatus;
       notifyUsers(rideStatus);
   }

    private void notifyUsers(RideStatus rideStatus) {
       passenger.notify("Your ride is ::" + rideStatus);
       driver.notify("ride status ::" + rideStatus);
    }


}
