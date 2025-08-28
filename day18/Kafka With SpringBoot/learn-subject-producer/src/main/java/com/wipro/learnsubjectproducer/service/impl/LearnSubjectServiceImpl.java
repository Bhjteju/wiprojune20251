package com.wipro.learnsubjectproducer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.learnsubjectproducer.dto.Subject;
import com.wipro.learnsubjectproducer.service.LearnSubjectService;


@Service
public class LearnSubjectServiceImpl implements LearnSubjectService {
	
	private static final String TOPIC = "learn-subject";
	
	@Autowired
	private KafkaTemplate<String, Subject> kafkaTemplate;
	
//
//    @Override
//    public String sendMessage(String message) {
//        kafkaTemplate.send(TOPIC, message);
//
//        System.out.println("Kafka topic name: " + TOPIC);
//        System.out.println("Message sent to Kafka: " + message);
//
//        return "Message sent to Kafka topic: " + TOPIC + " with message: " + message;
//    }
    


	public String sendSubject(Subject subject) {
	    kafkaTemplate.send(TOPIC, subject.getSubjectCode(), subject);
	    System.out.println("Sent message with key=" + subject.getSubjectCode() + " value=" + subject);
	    return "Message sent to Kafka topic: " + TOPIC;
	}
}
