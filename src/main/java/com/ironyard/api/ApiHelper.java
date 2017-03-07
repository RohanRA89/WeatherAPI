package com.ironyard.api;

import com.ironyard.dto.LocationInformation;
import com.ironyard.dto.WeatherByMinute;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by rohanayub on 2/28/17.
 */
public class ApiHelper {
    public LocationInformation getLocationWeather(Double latitude, Double longitude) {
        RestTemplate restTemplateCard = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");

        HttpEntity entity = new HttpEntity(headers);

        HttpEntity response = restTemplateCard.exchange("https://api.darksky.net/forecast/2bc9b4eeef27543c62a89114b80f3305/"+latitude+","+longitude, HttpMethod.GET, entity, LocationInformation.class);
        LocationInformation weatherForLocation = (LocationInformation) response.getBody();

        return weatherForLocation;
    }



}
