package com.demo.ride_sharing_app.V1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Driver {

    String name;

    Vehicle vehicle;

    Location location;
}
