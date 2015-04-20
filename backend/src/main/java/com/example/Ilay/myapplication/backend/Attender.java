package com.example.Ilay.myapplication.backend;

import com.googlecode.objectify.annotation.Id;

/**
 * Created by Ilay on 20/4/2015.
 */
public class Attender {
    @Id
    Long id;
    Long trempitUserid;
    Long eventid;
    String fullName;
    Location startingLocation;

    public Attender(Long trempitUserid, Long eventid, String fullName, Location startingLocation) {
        this.trempitUserid = trempitUserid;
        this.eventid = eventid;
        this.fullName = fullName;
        this.startingLocation = startingLocation;
    }

    public Long getTrempitUserid() {
        return trempitUserid;
    }

    public void setTrempitUserid(Long trempitUserid) {
        this.trempitUserid = trempitUserid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventid() {
        return eventid;
    }

    public void setEventid(Long eventid) {
        this.eventid = eventid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Location getStartingLocation() {
        return startingLocation;
    }

    public void setStartingLocation(Location startingLocation) {
        this.startingLocation = startingLocation;
    }
}
