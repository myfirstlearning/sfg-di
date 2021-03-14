package com.springframework.sfgdi;

import com.springframework.sfgdi.config.SfgConfiguration;
import com.springframework.sfgdi.config.SfgConstructorConfig;
import com.springframework.sfgdi.controller.*;
import com.springframework.sfgdi.datasource.FakeDataSource;
import com.springframework.sfgdi.service.impl.PrototypeBean;
import com.springframework.sfgdi.service.impl.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import springframework.pets.controller.PetController;

@ComponentScan(basePackages = {"springframework.pets","com.springframework.sfgdi"})
@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        System.out.println("------ Primary ");
        PrimaryGreetingController primaryGreetingController = (PrimaryGreetingController) ctx.getBean("primaryGreetingController");
        System.out.println(primaryGreetingController.getGreeting());

        System.out.println("------ Property ");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------ Setter ");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------ Constructor ");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("------ I18nGreetingController ");
        I18nGreetingController i18nGreetingController = (I18nGreetingController) ctx.getBean("i18nGreetingController");
        System.out.println(i18nGreetingController.getGreeting());

        System.out.println("------  CatPetService");
        PetController petController = (PetController) ctx.getBean("petController");
        System.out.println(petController.getPetType());

        System.out.println("!!!!!!!!!! Bean Scopes !!!!!!!!!!");

        SingletonBean singletonBean = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean.getMyScope());
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());

        PrototypeBean prototypeBean = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean.getMyScope());
        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());

        System.out.println("!!!!!!!!!! Fake Data Source !!!!!!!!!");
        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getJdbcurl());

        System.out.println("!!!!!!!!!! Config Props Bean !!!!!!!!!!!");
        SfgConfiguration sfgConfiguration = ctx.getBean(SfgConfiguration.class);
        System.out.println(sfgConfiguration.getUsername());
        System.out.println(sfgConfiguration.getPassword());
        System.out.println(sfgConfiguration.getJdbcurl());

        System.out.println("!!!!!!!!! Constructor Binding !!!!!!!!!!");
        SfgConstructorConfig sfgConstructorConfig = ctx.getBean(SfgConstructorConfig.class);
        System.out.println(sfgConstructorConfig.getUsername());
        System.out.println(sfgConstructorConfig.getPassword());
        System.out.println(sfgConstructorConfig.getJdbcurl());


    }

}
