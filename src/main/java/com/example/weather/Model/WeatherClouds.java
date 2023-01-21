package com.example.weather.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * RegistrationDetailsClouds
 */
@Data
public class WeatherClouds {
  @JsonProperty("all")
  private Integer all;

}

