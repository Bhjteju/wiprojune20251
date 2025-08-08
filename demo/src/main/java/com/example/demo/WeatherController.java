package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class WeatherController {
//
//    @GetMapping("/weather")
//    public String getWeather(
//            @RequestParam String city,
//            @RequestParam String day) {
//
//        // In real app, you’d fetch weather from a service or database
//        return "Weather in " + city + " for " + day + " is cloudy.";
//    }
//}


import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherController {

    @GetMapping("/weather")
    public String getWeather(
            @RequestParam String city,
            @RequestParam String day) {

        return "Weather in " + city + " for " + day + " is cloudy.";
    }

    @GetMapping("/tocentigrade/{fahrenheit}")
    public String convertToCentigrade(@PathVariable double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return  "the temperature in °c  " + String.format("%.2f", celsius) + "°C";
    }
}

