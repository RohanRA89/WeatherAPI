package com.ironyard.data;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ironyard.dto.LocationInformation;

import javax.persistence.*;
import java.util.List;

/**
 * Created by rohanayub on 3/1/17.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherUser {
    @Id
    @GeneratedValue
    private long id;
    private String userName;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    @ManyToMany (fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<LocationSaved> locations;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<LocationSaved> getLocations() {
        return locations;
    }

    public void setLocations(List<LocationSaved> locations) {
        this.locations = locations;
    }
}
