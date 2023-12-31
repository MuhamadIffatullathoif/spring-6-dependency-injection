package com.iffat.spring6.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev","default"})
@Service
public class EnvironmentServiceDev implements EnvironmentService {

    @Override
    public String getEnv() {
        return "dev";
    }
}
