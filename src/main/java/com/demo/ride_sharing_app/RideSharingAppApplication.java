package com.demo.ride_sharing_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.demo.ride_sharing_app.V1.entities.*;
//import com.demo.ride_sharing_app.V1.services.RideSharingAppService;



import com.demo.ride_sharing_app.V2.entities.*;
import com.demo.ride_sharing_app.V2.services.RideMatchingService;

@SpringBootApplication
public class RideSharingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RideSharingAppApplication.class, args);
		// create locations
//		Location loc1 = new Location(12.9716, 77.5946);
//		Location loc2 = new Location(12.9352, 77.6245);
//		Location loc3 = new Location(13.0352, 77.6175);
//
//		// craete vehicles
//		Vehicle car = new Vehicle("AB123CD","Car");
//		Vehicle bike = new Vehicle("XY456ZM","Bike");
//
//		// Create drivers
//		Driver driver1 = new Driver("Alice", car, loc2);
//		Driver driver2 = new Driver("Bob", bike, loc3);
//
//		// create passenger
//		Passenger passenger1 = new Passenger("John", loc1);
//		Passenger passenger2 = new Passenger("Sam", loc3);

		//  V1:    Test Ride Sharing app
//		RideSharingAppService app = new RideSharingAppService();
//		app.addDriver(driver1);
//		app.addDriver(driver2);
//
//		app.addPassenger(passenger1);
//		app.addPassenger(passenger2);
//
//		// book ride
//		app.bookRide(passenger1, 10);
//		app.bookRide(passenger2, 20);

		Location loc1 = new Location(12.9716, 77.5946);
		Location loc2 = new Location(12.9352, 77.6245);
		Location loc3 = new Location(13.0352, 77.6175);


		Vehicle car = new Car("AB123CD");
		Vehicle bike = new Bike("XY456ZM");

				Driver driver1 = new Driver("Alice","alice@gmail.com",loc2, car);
		Driver driver2 = new Driver("Bob","bob@example.com",loc3, bike);

				Passenger passenger1 = new Passenger("John","john@example.com", loc1);
		Passenger passenger2 = new Passenger("Sam","sam@example.com", loc3);


		RideMatchingService rideMatchingService = new RideMatchingService();

		rideMatchingService.addDriver(driver1);

		rideMatchingService.requestRide(passenger1, 10, new StandardFareStrategy());

		rideMatchingService.requestRide(passenger2, 5, new LuxuryFareStrategy());




	}

}
