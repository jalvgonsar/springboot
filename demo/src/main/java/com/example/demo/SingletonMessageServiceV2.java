package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class SingletonMessageServiceV2 {

    @Value("${miw.name}")
    private String name;

    @PostConstruct
    public  void myConstruct() {

        LogManager.getLogger(this.getClass()).warn("===>>> create Bean: SingletonMessageService");
        LogManager.getLogger(this.getClass()).warn("===>>> create miw.name:" + this.name);
    }

    public String getMessage() {

        return"("+ this.hashCode()+ ") SingletonMessageService!! miw.name: " + this.name;
    }

    public int getValue(int level) {

        return level * 10;
    }

    @PreDestroy
    public void destroy() {

        LogManager.getLogger(this.getClass()).info("===>>> SingletonMessageService::destroy()");
    }


}
