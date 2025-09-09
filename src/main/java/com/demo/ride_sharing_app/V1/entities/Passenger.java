package com.demo.ride_sharing_app.V1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Passenger {
    private String name;
    private Location location;
}
