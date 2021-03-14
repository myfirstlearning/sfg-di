package com.springframework.sfgdi.service.impl;

import com.springframework.sfgdi.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service
//@Primary
public class PrimaryGreetingService implements GreetingService {


    @Override
    public String sayHello() {
        return ">>>> Primary Greeting Service";
    }
}
