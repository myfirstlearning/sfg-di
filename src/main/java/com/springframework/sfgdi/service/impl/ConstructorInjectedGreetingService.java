package com.springframework.sfgdi.service.impl;

import com.springframework.sfgdi.service.GreetingService;
import org.springframework.stereotype.Service;

//@Service
public class ConstructorInjectedGreetingService implements GreetingService {


    @Override
    public String sayHello() {
        return ">>>> Constructor Injected Greeting Service";
    }
}
