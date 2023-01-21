package com.example.weather.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * RegistrationDetailsMain
 */
@Data
public class WeatherMain {
  @JsonProperty("temp")
  private Integer temp;

  @JsonProperty("feels_like")
  private BigDecimal feelsLike;

  @JsonProperty("temp_min")
  private BigDecimal tempMin;

  @JsonProperty("temp_max")
  private BigDecimal tempMax;

  @JsonProperty("pressure")
  private Integer pressure;

  @JsonProperty("humidity")
  private Integer humidity;

}

