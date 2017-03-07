package com.ironyard.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by rohanayub on 2/28/17.
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationInformation {

    private Double latitude;
    private Double longitude;
    private String timezone;
    private CurrentlyWeather currently;
    private WeatherByMinute minutely;
    private WeatherByHour hourly;


    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public CurrentlyWeather getCurrently() {
        return currently;
    }

    public void setCurrently(CurrentlyWeather currently) {
        this.currently = currently;
    }

    public WeatherByMinute getMinutely() {
        return minutely;
    }

    public void setMinutely(WeatherByMinute minutely) {
        this.minutely = minutely;
    }

    public WeatherByHour getHourly() {
        return hourly;
    }

    public void setHourly(WeatherByHour hourly) {
        this.hourly = hourly;
    }

    @Override
    public String toString() {
        return "LocationInformation{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", timezone='" + timezone + '\'' +
                ", currently=" + currently +
                ", Weather by the minute=" + minutely +
                ", Weather by the hour=" + hourly +
                '}';
    }
}
