package com.iffat.spring6.dependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Everyone !!!";
    }
}
