package com.example.weather.Controller;

import com.example.weather.Exception.CommonException;
import com.example.weather.Model.WeatherDetails;
import com.example.weather.WeatherService.WeatherServiceImpl;
import com.example.weather.proxy.WeatherProx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@CrossOrigin
public class Controller {

    @Autowired
    WeatherServiceImpl weatherService;

    @Autowired
    WeatherProx weatherProxy;
    @GetMapping(value= "weatherDetails")
    public ResponseEntity<WeatherDetails> getAgendaMomInfo(@RequestParam("cityName") String cityName, @RequestParam("appId") String appId) throws CommonException {
        WeatherDetails weatherDetails=weatherService.cityWeather(cityName, appId);
            return new ResponseEntity<>(weatherDetails, HttpStatus.OK);


    }

}
