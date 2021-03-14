package com.springframework.sfgdi.repository.impl;

import com.springframework.sfgdi.repository.EnglishGreetingRepository;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
