package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Model {
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("cityName")
    private String cityName;

    @JsonProperty("Temperature")
    private String temperature;

}
