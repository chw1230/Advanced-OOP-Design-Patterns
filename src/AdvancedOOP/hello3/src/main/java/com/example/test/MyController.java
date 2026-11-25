package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MyController {
    private final MyService service;

    public MyController(MyService service) { this.service = service; }
    @GetMapping("/hello")
    public String hello() { return service.greet(); }
}