package com.swaggerexemple.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("")
@RestController
public class NameController {

    @GetMapping
    public String helloMess(){
        return "Hello buddy";
    }
    @GetMapping("/name")
    public String getName(){
        return "Federico";
    }
}
