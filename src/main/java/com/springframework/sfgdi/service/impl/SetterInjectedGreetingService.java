package com.springframework.sfgdi.service.impl;

import com.springframework.sfgdi.service.GreetingService;
import org.springframework.stereotype.Service;

//@Service
public class SetterInjectedGreetingService implements GreetingService {


    @Override
    public String sayHello() {
        return  ">>>>> Setter Injected Greeting Service";
    }
}
