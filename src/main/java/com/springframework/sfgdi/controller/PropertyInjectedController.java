package com.springframework.sfgdi.controller;

import com.springframework.sfgdi.service.impl.PropertyInjectedGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("propertyInjectedController")
public class PropertyInjectedController {

    @Autowired
    private PropertyInjectedGreetingService propertyInjectedGreetingService;

    public String getGreeting(){

        return propertyInjectedGreetingService.sayHello();
    }

}
