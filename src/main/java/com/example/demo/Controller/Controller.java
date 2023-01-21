package com.example.demo.Controller;

import com.example.demo.Exception.BadRequest;
import com.example.demo.Exception.CommonException;
import com.example.demo.Model.Model;
import com.example.demo.Model.WeatherDetails;
import com.example.demo.WeatherService.WeatherServiceImpl;
import com.example.demo.proxy.WeatherProx;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

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
