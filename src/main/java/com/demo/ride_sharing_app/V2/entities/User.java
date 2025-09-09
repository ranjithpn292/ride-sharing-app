package com.demo.ride_sharing_app.V2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
abstract class User {
    protected String name;
    protected String email;
    protected Location location;

    public abstract void notify(String msg);
}
