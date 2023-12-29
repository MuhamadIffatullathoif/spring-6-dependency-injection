package com.iffat.spring6.dependencyinjection.controllers;

import com.iffat.spring6.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyServiceInjected")
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
