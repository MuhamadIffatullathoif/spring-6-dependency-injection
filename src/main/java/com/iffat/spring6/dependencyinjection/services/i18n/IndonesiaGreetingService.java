package com.iffat.spring6.dependencyinjection.services.i18n;

import com.iffat.spring6.dependencyinjection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ID")
@Service("i18NService")
public class IndonesiaGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Halo Dunia - ID";
    }
}
