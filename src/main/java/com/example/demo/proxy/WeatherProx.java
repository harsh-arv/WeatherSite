package com.example.demo.proxy;

import com.example.demo.Model.WeatherDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "weather-service", url = "api.openweathermap.org/data/2.5")
public interface WeatherProx {
    @GetMapping("/weather")
    WeatherDetails checkWeather(@RequestParam String q, @RequestParam String appId);
}
