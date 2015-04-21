package com.example.Ilay.myapplication.backend;

/**
 * Created by Ilay on 20/4/2015.
 */
public class Passenger extends Attender {
    Long driverid;

    public Passenger() {
        super();
    }


    public Long getDriverid() {
        return driverid;
    }

    public void setDriverid(Long driverid) {
        this.driverid = driverid;
    }
}
