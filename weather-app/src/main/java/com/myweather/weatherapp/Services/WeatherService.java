/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myweather.weatherapp.Services;

import com.myweather.weatherapp.Entities.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author USER
 */
@Service
public class WeatherService {
    
    
    private RestTemplate restTemplate;

    @Autowired
    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    
    
    private final String apiKey = "1452e6b007c899ae03276c769747b825";

   public WeatherData fetchWeatherData(){
       String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=" + apiKey;
       WeatherData weatherData = restTemplate.getForObject(apiUrl, WeatherData.class);
       return weatherData;
    }
}
