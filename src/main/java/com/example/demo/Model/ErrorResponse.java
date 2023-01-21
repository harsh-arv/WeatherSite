package com.example.demo.Model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ErrorResponse
 */
@Data
public class ErrorResponse {
  @JsonProperty("timestamp")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  @JsonProperty("error")
  private String error;

  @JsonProperty("errorMsgs")
  private List<String> errorMsgs = null;

  @JsonProperty("path")
  private String path;

  @JsonProperty("exceptionType")
  private String exceptionType;
}