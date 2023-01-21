package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * RegistrationDetails
 */
@Data
public class WeatherDetails {
  @JsonProperty("coord")
  private WeatherCoord cord;

  @JsonProperty("weather")
  private List<Weather> weather;

  @JsonProperty("base")
  private String base;

  @JsonProperty("main")
  private WeatherMain main;

  @JsonProperty("visibility")
  private Integer visibility;

  @JsonProperty("wind")
  private WeatherWind wind;

  @JsonProperty("clouds")
  private WeatherClouds clouds;

  @JsonProperty("dt")
  private Integer dt;

  @JsonProperty("sys")
  private WeatherSys sys;

  @JsonProperty("timezone")
  private Integer timezone;

  @JsonProperty("id")
  private BigDecimal id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("cod")
  private Integer cod;

}

