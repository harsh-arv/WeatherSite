package com.example.weather.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class WeatherDb {
    @Id
    private Integer id;
    private Integer Longitude;
    private Integer Latitude;
    private Integer CurrentTemp;
    private Integer Humidity;
    private Integer Pressure;
    private Integer Visibility;
    private String AirQuality;
    private String Country;
    private Integer TimeZone;
    private String City;


}
