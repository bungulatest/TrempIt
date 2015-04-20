package com.example.Ilay.myapplication.backend;

import com.googlecode.objectify.annotation.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Ilay on 20/4/2015.
 */
public class Event {
    @Id
    Long id;
    Date startTime;
    Location location;
    String title;
    List<Driver> driverList;
    List<Attender> attenderList;
    Map<Driver, List<Passenger>> pendingPassengers; //TODO: use Driver as key or driverid?

    public Event(Date startTime, Location location, String title) {
        this.startTime = startTime;
        this.location = location;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<Driver> driverList) {
        this.driverList = driverList;
    }

    public List<Attender> getAttenderList() {
        return attenderList;
    }

    public void setAttenderList(List<Attender> attenderList) {
        this.attenderList = attenderList;
    }

    public Map<Driver, List<Passenger>> getPendingPassengers() {
        return pendingPassengers;
    }

    public void setPendingPassengers(Map<Driver, List<Passenger>> pendingPassengers) {
        this.pendingPassengers = pendingPassengers;
    }
}
