package com.iffat.spring6.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service("propertyServiceInjected")
public class GreetingServicePropertyInjected implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Greeting service property injected";
    }
}
