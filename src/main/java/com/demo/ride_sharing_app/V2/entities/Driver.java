package com.demo.ride_sharing_app.V2.entities;

import lombok.Getter;

public class Driver extends User{

    @Getter
    private Vehicle vehicle;

    public Driver(String name, String email, Location location, Vehicle vehicle){
        super(name,email,location);
        this.vehicle = vehicle;
    }

    @Override
    public void notify(String msg) {
        System.out.println("driver:" + msg);
    }
}
