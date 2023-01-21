package com.example.weather.Repository;

import com.example.weather.Entity.WeatherDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WeatherRepository extends JpaRepository<WeatherDb,Integer> {

    @Query(value = "SELECT MAX(ID ) FROM WEATHER_DB",nativeQuery = true)
    Integer findByMaxID();

}
