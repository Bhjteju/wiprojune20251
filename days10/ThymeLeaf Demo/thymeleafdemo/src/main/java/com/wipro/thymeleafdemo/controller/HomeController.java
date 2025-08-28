package com.wipro.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("name", "This is Thymeleaf Demo");
        return "home";
	}
}
