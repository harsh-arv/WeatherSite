package com.example.weather.Model;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

import lombok.Data;

/**
 * RegistrationDetailsWind
 */
@Data
public class WeatherWind {
  @JsonProperty("speed")
  private BigDecimal speed;

  @JsonProperty("deg")
  private Integer deg;
}

