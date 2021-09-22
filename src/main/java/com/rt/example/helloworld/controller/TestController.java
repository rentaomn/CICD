package com.rt.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/print")
    public String printSample(){
        String sampleString = "hello renTao! luck renTao!";
        System.out.println(sampleString);
        return sampleString;
    }
}
