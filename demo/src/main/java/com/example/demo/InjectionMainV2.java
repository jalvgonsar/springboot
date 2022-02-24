package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // @Service @Repository @Controller
public class InjectionMainV2 {

    @Autowired
    private SingletonMessageService singletonMessageService;
    @Autowired
    private SingletonMessageService singletonMessageService2;
    @Autowired
    private PrototypeInjectionOnlyMessageService prototypeInjectionOnlyMessageService;
    @Autowired
    private PrototypeInjectionOnlyMessageService prototypeInjectionOnlyMessageService2;

    public String getMessage() {
        return this.singletonMessageService.getMessage();
    }


    public void debug() {
        LogManager.getLogger(this.getClass()).info(() -> "===>>> InjectionMain::singleton: " + this.singletonMessageService.getMessage());
        LogManager.getLogger(this.getClass()).info(() -> "===>>> InjectionMain::singleton2: " + this.singletonMessageService2.getMessage());
        LogManager.getLogger(this.getClass()).info(() -> "===>>> InjectionMain::prototype: " + this.prototypeInjectionOnlyMessageService.getMessage());
        LogManager.getLogger(this.getClass()).info(() -> "===>>> InjectionMain::prototype2: " + this.prototypeInjectionOnlyMessageService2.getMessage());
    }

}
