package com.example.demo.Model;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.Data;

/**
 * RegistrationDetailsSys
 */
@Data
public class WeatherSys {
  @JsonProperty("type")
  private BigDecimal type;

  @JsonProperty("id")
  private BigDecimal id;

  @JsonProperty("country")
  private String country;

  @JsonProperty("sunrise")
  private String sunrise;

  @JsonProperty("sunset")
  private BigDecimal sunset;

  @JsonProperty("humidity")
  private Integer humidity;

}

