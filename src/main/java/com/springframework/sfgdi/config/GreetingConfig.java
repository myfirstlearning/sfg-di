package com.springframework.sfgdi.config;


import com.springframework.sfgdi.datasource.FakeDataSource;
import com.springframework.sfgdi.repository.EnglishGreetingRepository;
import com.springframework.sfgdi.repository.impl.EnglishGreetingRepositoryImpl;
import com.springframework.sfgdi.service.impl.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import springframework.pets.factory.PetServiceFactory;
import springframework.pets.service.PetService;

//@PropertySource("classpath:datasource.properties") //bring the property files
@EnableConfigurationProperties(SfgConstructorConfig.class)
@Configuration
public class GreetingConfig {

    @Bean("i18nService")
    @Profile("EN")
    I18nEnglishGreetingService i18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Bean("i18nService")
    @Profile("ES")
    I18nSpanishGreetingService i18nSpanishGreetingService(){
        return new I18nSpanishGreetingService();
    }

    @Bean
    @Primary
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorInjectedGreetingService constructorInjectedGreetingService(){
        return new ConstructorInjectedGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }

    @Bean
    PetServiceFactory  petServiceFactory(){
        return new PetServiceFactory();
    }

    @Profile({"dog","default"})
    @Bean
    PetService dogPetService(){
        return petServiceFactory().getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService(){
        return petServiceFactory().getPetService("cat");
    }

    @Bean
    /*FakeDataSource fakeDataSource(@Value("${data.username}") String username,
                                  @Value("${data.password}") String password,
                                  @Value("${data.jdbcurl}") String jdbcurl){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcurl(jdbcurl);
        return fakeDataSource;
    }*/
    FakeDataSource fakeDataSource(SfgConfiguration sfgConfiguration){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConfiguration.getUsername());
        fakeDataSource.setPassword(sfgConfiguration.getPassword());
        fakeDataSource.setJdbcurl(sfgConfiguration.getJdbcurl());
        return fakeDataSource;
    }

}
