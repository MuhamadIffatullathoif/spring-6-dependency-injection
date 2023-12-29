package com.iffat.spring6.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service("serviceSetterInjected")
public class GreetingServiceSetterInjected implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Setter injected service";
    }
}
