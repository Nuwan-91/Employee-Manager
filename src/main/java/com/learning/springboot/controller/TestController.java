package com.learning.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    public TestController(){
    }

    @GetMapping
    public String getString(){
        return "Spring Boot Application - TestController - getString Method()";
    }
}
