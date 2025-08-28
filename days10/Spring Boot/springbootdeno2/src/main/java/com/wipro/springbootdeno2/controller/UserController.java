package com.wipro.springbootdeno2.controller;

import com.wipro.springbootdeno2.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/register")
    public String showLoginForm(Model m) {
        m.addAttribute("user", new User());
        return "userreg";
    }

    @PostMapping("/registerUser")
    public String submitLoginForm(@ModelAttribute("user") User user, Model m) {
        System.out.println("Registered User:");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getUserEmail());
        System.out.println("Phone: " + user.getUserPhone());
        return "success"; 
    }
}
