package com.springframework.sfgdi.service.impl;

import com.springframework.sfgdi.service.GreetingService;
import org.springframework.stereotype.Service;

//@Service
public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return  ">>>> Property Injection Greeting Service";
    }
}
