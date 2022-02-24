package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;

// @Service("singletonMessageService") o @Service(value="singletonMessageService") Default
// @Scope("prototype") //Default singleton
// @Scope("org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE")
@Service  //@Component @Controller @Service @Repository @RestController
public class SingletonMessageService {

    private String name;

    public SingletonMessageService(@Value("${miw.name}") String name) {  // resources/application.properties
        this.name = name;
        LogManager.getLogger(this.getClass()).info("===>>> create Bean: SingletonMessageService");
    }

    public String getMessage() {

        return "SingletonMessageService::miw.name: " + this.name;
    }

    public int getValue(int level) {

        return level * 10;
    }

    @PreDestroy
    public void destroy() {

        LogManager.getLogger(this.getClass()).info("===>>> SingletonMessageService::destroy()");
    }

}