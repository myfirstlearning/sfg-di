package com.springframework.sfgdi.controller;

import com.springframework.sfgdi.service.impl.SetterInjectedGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("setterInjectedController")
public class SetterInjectedController {

    private SetterInjectedGreetingService setterInjectedGreetingService;

    @Autowired
    public void setSetterInjectedGreetingService(SetterInjectedGreetingService setterInjectedGreetingService) {
        this.setterInjectedGreetingService = setterInjectedGreetingService;
    }

    public String getGreeting(){

        return setterInjectedGreetingService.sayHello();
    }
}
