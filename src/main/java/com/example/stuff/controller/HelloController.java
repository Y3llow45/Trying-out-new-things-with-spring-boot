package com.example.stuff.controller;

import com.example.stuff.exception.ApiRequestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/test")
    public String test() {
        throw new ApiRequestException("Somet went wrong");
    }
}
