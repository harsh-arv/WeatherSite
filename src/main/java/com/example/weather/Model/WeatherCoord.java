package com.example.weather.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * RegistrationDetailsCoord
 */
@Data
public class WeatherCoord {
  @JsonProperty("lon")
  private Integer lon;

  @JsonProperty("lat")
  private Integer lat;

}

