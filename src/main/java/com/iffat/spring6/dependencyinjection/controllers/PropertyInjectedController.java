package com.iffat.spring6.dependencyinjection.controllers;

import com.iffat.spring6.dependencyinjection.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
