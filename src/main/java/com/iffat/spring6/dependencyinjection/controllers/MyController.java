package com.iffat.spring6.dependencyinjection.controllers;

import com.iffat.spring6.dependencyinjection.services.GreetingService;
import com.iffat.spring6.dependencyinjection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("Controller method");
        return greetingService.sayGreeting();
    }
}
