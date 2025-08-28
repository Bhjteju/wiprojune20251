package com.wipro.notificationms.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.notificationms.entity.Notification;
import com.wipro.notificationms.service.NotificationService;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/notify")
    public ResponseEntity<String> sendNotification(@RequestBody Map<String, Object> request) {
        Map<String, Object> userMap = (Map<String, Object>) request.get("user");
        String action = (String) request.get("action");

        Notification notification = new Notification();
        notification.setUserId((int) userMap.get("userId"));
        notification.setUsername((String) userMap.get("username"));
        notification.setAction(action);

        notificationService.save(notification);

        return ResponseEntity.ok("Notification stored and printed.");
    }


    @GetMapping("/notify")
    public ResponseEntity<String> notifyTest() {
        return ResponseEntity.ok("Notification service is running.");
    }
}
