package com.ironyard.controllers;

import com.ironyard.api.ApiHelper;
import com.ironyard.data.LocationSaved;
import com.ironyard.data.WeatherUser;
import com.ironyard.dto.LocationInformation;
import com.ironyard.repo.WeatherUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rohanayub on 2/28/17.
 */
@RestController
public class WeatherRestController {
    @Autowired
    private WeatherUserRepo weatherUserRepo;



    @RequestMapping(path = "/rest/getWeatherForLocation", method = RequestMethod.GET)
    public LocationInformation getCurrentLocation(@RequestParam Double latitude, @RequestParam Double longitude) {
        ApiHelper helper = new ApiHelper();
        LocationInformation currentLocation = helper.getLocationWeather(latitude, longitude);


        return currentLocation;

    }

    @RequestMapping(path = "/rest/createUser", method = RequestMethod.POST)
    public WeatherUser createUser(@RequestParam String userName, @RequestParam String password) {
        WeatherUser createdUser = new WeatherUser();
        createdUser.setUserName(userName);
        createdUser.setPassword(password);
        weatherUserRepo.save(createdUser);
        return createdUser;

    }

    @RequestMapping(path = "/rest/saveLocation/{yourId}", method = RequestMethod.POST)
    public String saveCurrentLocation(@PathVariable Long yourId, @RequestParam String password, @RequestParam Double latitude,
                                      @RequestParam Double longitude) {
        String signIn = null;
        WeatherUser found = weatherUserRepo.findOne(yourId);
        String storedPassword = found.getPassword();
        String storedName = found.getUserName();

        if(password.equals(storedPassword)) {
            ApiHelper helper = new ApiHelper();
            LocationInformation currentLocation = helper.getLocationWeather(latitude, longitude);
            Double savedLatitude = currentLocation.getLatitude();
            Double savedLongitude = currentLocation.getLongitude();
            LocationSaved locations = new LocationSaved(savedLatitude, savedLongitude);
            found.getLocations().add(locations);
            weatherUserRepo.save(found);
            signIn = "Your location of\nLatitude: " + savedLatitude + "\nLongitude: " + savedLongitude + "\nwas saved successfully.";
            return signIn;
        }
        else {
            signIn = "Your password for account with username:\n"+storedName+"\n Was incorrect. Please check your password and try again.";
            return signIn;
        }





    }
    @RequestMapping (path="/rest/allUsers" , method = RequestMethod.GET)
    public Iterable<WeatherUser> retreiveUsers(){
        return weatherUserRepo.findAll();
    }
}
