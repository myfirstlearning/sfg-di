package com.springframework.sfgdi.controller;

import com.springframework.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("i18nGreetingController")
public class I18nGreetingController {


    @Autowired
    @Qualifier("i18nService")
    private GreetingService i18nService;

    public String getGreeting(){

        return i18nService.sayHello();
    }

}
