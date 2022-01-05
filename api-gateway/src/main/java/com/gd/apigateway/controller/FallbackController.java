package com.gd.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/user-service-fallback")
    public String userServiceFallback() {
        return "User Service is down!";
    }

    @GetMapping("/contact-service-fallback")
    public String contactServiceFallback() {
        return "Contact Service is down!";
    }

}
