package com.iffat.spring6.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimaryBeanImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from primary bean";
    }
}
