package com.example.weather.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherController {
	 @GetMapping("/weather")
	    public String getWeather(
	            @RequestParam String city,
	            @RequestParam String day) {
	        
	        // You can use real logic or just mock a response for now
	        return "Weather in " + city + " for " + day + " Sunny.";
	    }

}
