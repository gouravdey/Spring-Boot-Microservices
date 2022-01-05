package com.gd.userservice.controller;

import com.gd.userservice.model.User;
import com.gd.userservice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private final RestTemplate restTemplate;
    private final UserService userService;

    public UserController(RestTemplate restTemplate, UserService userService) {
        this.restTemplate = restTemplate;
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {

        User user = userService.getUser(userId);
        List contactList = restTemplate.getForObject("http://CONTACT-SERVICE/api/v1/contact/user/" + user.getUserId(), List.class);
        user.setContacts(contactList);
        return user;
    }
}
