package com.example.weather.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


/**
 * Weather
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-03T14:04:57.019398300+05:30[Asia/Calcutta]")
@Data
public class Weather {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("main")
  private String main;

  @JsonProperty("description")
  private String description;

  @JsonProperty("icon")
  private String icon;

  public Weather id(Integer id) {
    this.id = id;
    return this;
  }
}