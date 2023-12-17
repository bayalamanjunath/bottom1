package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

int counter = 0;

    @GetMapping("/hello")
    public String sendGreetings() {
        counter++;
        return "Hello, World!"+counter;
    }
}
