package com.wipro.jwtdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class HelloController {
	
	@RequestMapping("/hello")
	public String helloWorld(@RequestParam(value="name", defaultValue="World") String name) {
		return "Hello "+name+"!!";
	}
	
	@RequestMapping("/newhello")
	public String helloWorldNew(@RequestParam(value="name", defaultValue="World") String name) {
		return "Hello -New "+name+"!!";
	}

}
