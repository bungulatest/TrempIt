package com.example.Ilay.myapplication.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ilay on 20/4/2015.
 */

@Entity
public class TrempitUser {
    @Id
    Long id;
    String fullName;
    Location homeLocation;
    List<Passenger> passengerList = new ArrayList<>(); // a different Attender object for each Event
    List<Driver> driverList = new ArrayList<>();

    public TrempitUser() {
        //this.id = new Long(1);
    }

    public TrempitUser(String fullName, Location homeLocation) {
        this.fullName = fullName;
        this.homeLocation = homeLocation;
    }


    public List<Passenger> getPendingPassengers(){
        List<Passenger> pendingPassengers = new ArrayList<Passenger>();
        for(Driver driver : driverList)
            for(Passenger passenger : driver.pendingPassengerList)
                pendingPassengers.add(passenger);
        return pendingPassengers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Location getHomeLocation() {
        return homeLocation;
    }

    public void setHomeLocation(Location homeLocation) {
        this.homeLocation = homeLocation;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public List<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<Driver> driverList) {
        this.driverList = driverList;
    }
}
