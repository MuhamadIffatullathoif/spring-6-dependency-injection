package com.iffat.spring6.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Controller method");
        return "Hello World";
    }
}
