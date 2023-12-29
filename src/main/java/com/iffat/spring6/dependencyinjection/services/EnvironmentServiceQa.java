package com.iffat.spring6.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class EnvironmentServiceQa implements EnvironmentService {

    @Override
    public String getEnv() {
        return "qa";
    }
}
