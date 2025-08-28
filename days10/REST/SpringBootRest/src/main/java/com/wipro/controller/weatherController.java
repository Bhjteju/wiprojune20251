package com.wipro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.dto.Mobile;

@RestController
public class weatherController {
	
	@GetMapping("/weather")
	public String showWheatherReport(@RequestParam String city,@RequestParam String day)
	{
		return "Weather in "+city+" for "+day +" is cloudy";
	}
	@GetMapping("/convert/{fahrenheit}")
	public int convertFahrenheitToCentigrade(@PathVariable int fahrenheit)
	{
		int result=(fahrenheit-32)*9/5;
		return result;
	}
	
	
}
