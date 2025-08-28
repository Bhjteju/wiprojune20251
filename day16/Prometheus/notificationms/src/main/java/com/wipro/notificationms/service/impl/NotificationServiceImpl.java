package com.wipro.notificationms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.notificationms.entity.Notification;
import com.wipro.notificationms.repo.NotificationRepo;
import com.wipro.notificationms.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService {

		 @Autowired
		 private NotificationRepo notificationRepo;

		 @Override
		    public void save(Notification notification) {
		        notificationRepo.save(notification);
		    }

}
