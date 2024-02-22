/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myweather.weatherapp.Entities;

import com.fasterxml.jackson.databind.JsonNode;

/**
 *
 * @author USER
 */
public class WeatherData {
    private JsonNode weather;
    
    public WeatherData(JsonNode weatherJsonNode){
        this.weather = weatherJsonNode;
    }

    public JsonNode getWeather() {
        return weather;
    }

    public void setWeather(JsonNode weather) {
        this.weather = weather;
    }
    
    
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String city;
    private double temperature;
    private String description;

    public WeatherData() {
    }

    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
