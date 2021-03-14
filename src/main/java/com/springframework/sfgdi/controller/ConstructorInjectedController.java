package com.springframework.sfgdi.controller;

import com.springframework.sfgdi.service.impl.ConstructorInjectedGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("constructorInjectedController")
public class ConstructorInjectedController {

    private ConstructorInjectedGreetingService constructorInjectedGreetingService;

    @Autowired
    public ConstructorInjectedController(ConstructorInjectedGreetingService constructorInjectedGreetingService) {
        this.constructorInjectedGreetingService = constructorInjectedGreetingService;
    }

    public String getGreeting(){

        return constructorInjectedGreetingService.sayHello();
    }
}
