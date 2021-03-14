package com.springframework.sfgdi.service.impl;

import com.springframework.sfgdi.repository.EnglishGreetingRepository;
import com.springframework.sfgdi.service.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayHello() {
        return englishGreetingRepository.getGreeting();
    }
}
