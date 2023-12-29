package com.iffat.spring6.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class EnvironmentServiceProd implements EnvironmentService{
    @Override
    public String getEnv() {
        return "prod";
    }
}
