package com.wipro.learnsubjectconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.wipro.learnsubjectconsumer.dto.Subject;

@Component
public class LearnSubjectConsumer {

//		@KafkaListener(topics = "learn-subject", groupId = "group_id")
//	    public void consume(String msg) {
//	        System.out.println("Consumed message: " + msg);
//	    }
	
	@KafkaListener(topics = "learn-subject", groupId = "subject-group", containerFactory = "subjectKafkaListenerContainerFactory")
	public void consume(Subject subject) {
	    System.out.println("Consumed subject: " + subject);
	}

	
}

