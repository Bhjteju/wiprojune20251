package com.wipro.userms.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.userms.entity.User;
import com.wipro.userms.repo.UserRepo;
import com.wipro.userms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RestTemplate restTemplate;

    private static final String NOTIFY_URL = "http://notificationms/notify";

    @Override
    public User createUser(User user) {
        User saved = userRepo.save(user);
        notify(saved, "Created");
        return saved;
    }

    @Override
    public User updateUser(User user) {
        User updated = userRepo.save(user);
        notify(updated, "Updated");
        return updated;
    }

    @Override
    public void deleteUser(int id) {
        Optional<User> optionalUser = userRepo.findById(id);
        optionalUser.ifPresent(user -> {
            userRepo.deleteById(id);
            notify(user, "Deleted");
        });
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepo.findById(id).orElse(null);
    }

    private void notify(User user, String action) {
        if (user.getUserId() != null && user.getUsername() != null) {
            Map<String, Object> userMap = new HashMap<>();
            userMap.put("userId", user.getUserId());
            userMap.put("username", user.getUsername());

            Map<String, Object> request = new HashMap<>();
            request.put("user", userMap);
            request.put("action", action);

            System.out.println("Payload to Notification MS: " + request);

            ResponseEntity<String> response = restTemplate.postForEntity(NOTIFY_URL, request, String.class);
            System.out.println("Notification Response: " + response.getBody());
        } else {
            System.out.println("User data incomplete. Skipping notification.");
        }
    }

}
