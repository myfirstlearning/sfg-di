package com.springframework.sfgdi.service.impl;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton bean !!!!!");
    }

    public String getMyScope(){
        return "I am Singleton";
    }

}
