package com.demo.ride_sharing_app.V2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Location {
    double latitude;
    double longitude;

    public double calcDistance(Location two){
        // Euclidean distance
        double dx= this.getLatitude() - two.getLatitude();
        double dy= this.getLongitude() - two.getLongitude();

        return Math.sqrt(dx*dx + dy*dy);
    }
}
