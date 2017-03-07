package com.ironyard.dto;

import java.util.List;

/**
 * Created by rohanayub on 2/28/17.
 */
public class WeatherByMinute {
    private String summary;
    private List<DataByMinute> data;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<DataByMinute> getData() {
        return data;
    }

    public void setData(List<DataByMinute> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Weather By Minute{" +
                "summary='" + summary + '\'' +
                ", data=" + data +
                '}';
    }
}
