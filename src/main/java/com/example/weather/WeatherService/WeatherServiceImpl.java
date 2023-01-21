package com.example.weather.WeatherService;


import com.example.weather.Entity.WeatherDb;
import com.example.weather.Exception.BadRequest;
import com.example.weather.Exception.CommonException;
import com.example.weather.Model.WeatherDetails;
import com.example.weather.Repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.example.weather.proxy.WeatherProx;

import javax.transaction.Transactional;


@Service
@Transactional
public class WeatherServiceImpl {
    @Autowired
    WeatherProx weatherProx;

    @Autowired
    WeatherRepository weatherRepository;
    public WeatherDetails cityWeather(String city, String appId) throws CommonException {
        try {
            WeatherDetails weatherDetails=weatherProx.checkWeather(city,appId);

            WeatherDb weatherDb=new WeatherDb();
            Integer id= weatherRepository.findByMaxID();

            if(id!=null)
                weatherDb.setId(id+1);
            else weatherDb.setId(1);

            weatherDb.setCountry(weatherDetails.getSys().getCountry());
            weatherDb.setHumidity(weatherDetails.getMain().getHumidity());
            weatherDb.setLatitude(weatherDetails.getCord().getLat());
            weatherDb.setLongitude(weatherDetails.getCord().getLon());
            weatherDb.setAirQuality(weatherDetails.getWeather().get(0).getDescription());
            weatherDb.setPressure(weatherDetails.getMain().getPressure());
            weatherDb.setCurrentTemp(weatherDetails.getMain().getTemp());
            weatherDb.setVisibility(weatherDetails.getVisibility());
            weatherDb.setCity(weatherDetails.getName());
            weatherDb.setTimeZone(weatherDetails.getTimezone());

            weatherRepository.saveAndFlush(weatherDb);
            return weatherDetails;

        }catch (BadRequest ex){
            ex.printStackTrace();
            throw new BadRequest(ex.getMessage());
        }
        catch ( Exception e){
            e.printStackTrace();
            throw new CommonException("CityNotFound", "TECHNICAL_ERROR", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
