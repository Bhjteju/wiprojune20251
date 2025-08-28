package com.wipro.logdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This is important so Spring can detect it as a REST Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/greet")
    public String greet() {
        String str = "Srikanth";
        System.err.println("-- Home Controller --");

        logger.trace("-- Home Controller : Greet " + str);
        logger.error("--Error--");
        logger.warn("--WARN--");
        logger.info("--INFO--");
        logger.debug("--DEBUG--");
        logger.trace("--TRACE--");

        return "Hey!!! Greet";
    }

    @GetMapping("/hello")
    public String hello() {
        logger.trace("-- Home Controller : Hello");
        return "Hey!!! Hello";
    }
}
