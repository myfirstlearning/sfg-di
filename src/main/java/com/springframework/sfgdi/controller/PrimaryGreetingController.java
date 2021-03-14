package com.springframework.sfgdi.controller;

import com.springframework.sfgdi.service.impl.PrimaryGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("primaryGreetingController")
public class PrimaryGreetingController {

    @Autowired
    private PrimaryGreetingService primaryGreetingService;

    public String getGreeting(){

        return primaryGreetingService.sayHello();
    }


}
