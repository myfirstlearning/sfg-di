package com.springframework.sfgdi.service.impl;

import com.springframework.sfgdi.service.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"ES", "default"})
//@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello World - ES";
    }
}
