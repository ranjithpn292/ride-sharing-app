package com.demo.ride_sharing_app.V2.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Passenger extends User {

    public Passenger(String name, String email, Location location) {
        super(name, email, location);
    }

    @Override
    public void notify(String msg){
        System.out.println("passenger:" + msg);
    }
}
