package com.wipro.learnsubjectproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.learnsubjectproducer.dto.Subject;
import com.wipro.learnsubjectproducer.service.LearnSubjectService;


@RestController
@RequestMapping("/learn")
public class LearnSubjectController {

    @Autowired
    private LearnSubjectService producerService;

//    @PostMapping
//    public String sendMessage(
//            @RequestParam String subject,
//            @RequestParam String message) {
//
//        String finalMessage = subject + ": " + message;
//        producerService.sendMessage(finalMessage);
//        return "Message sent to Kafka topic successfully!";
//    }
    
    @PostMapping()
    public String publishMessage(@ModelAttribute Subject subject) {
        return producerService.sendSubject(subject);
    }



}

