package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

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

