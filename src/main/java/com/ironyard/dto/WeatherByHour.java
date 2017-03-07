package com.ironyard.dto;

import java.util.List;

/**
 * Created by rohanayub on 3/1/17.
 */
public class WeatherByHour {
    private String summary;
    private List<DataByHour> data;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<DataByHour> getData() {
        return data;
    }

    public void setData(List<DataByHour> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Weather by the Hour{" +
                "summary='" + summary + '\'' +
                ", data=" + data +
                '}';
    }
}
