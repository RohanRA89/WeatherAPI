package com.ironyard.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by rohanayub on 2/28/17.
 */
public class DataByMinute {
    private Long time;
    private Integer precipIntensity;
    private Integer precipProbability;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Integer getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(Integer precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public Integer getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(Integer precipProbability) {
        this.precipProbability = precipProbability;
    }

    @Override
    public String toString() {
        return "DataByMinute{" +
                "time=" + changeLongTime() +
                ", precipIntensity=" + precipIntensity +
                ", precipProbability=" + precipProbability +
                '}';
    }
    public String changeLongTime(){
        Date longTime = new Date((time*1000));
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String dateFormatted = formatter.format(longTime);
        return dateFormatted;

    }
}
