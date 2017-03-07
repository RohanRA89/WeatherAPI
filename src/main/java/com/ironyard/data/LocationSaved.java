package com.ironyard.data;

import com.ironyard.dto.LocationInformation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by rohanayub on 3/1/17.
 */
@Entity
public class LocationSaved {
    @Id
    @GeneratedValue
    private long id;
    private double latitude;
    private double longitude;
    //private String time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

//    public String getTime() {
//        return time;
//    }
//
//    public void setTime(String time) {
//        this.time = time;
//    }

    public LocationSaved() {
    }

    public LocationSaved(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
