package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//default: src/main/resource/application.properties
// @PropertySource("classpath:miw.properties")
// @PropertySource("file:///C:/JBB/miw.properties")
// @PropertySource("http://server/application.properties")
// @ConfigurationProperties(prefix="miw")
@Configuration
public class InjectionConfiguration {

    @Bean
    @Scope("prototype")
    public PrototypeInjectionOnlyMessageService prototypeInjectionOnlyMessageService() {
        LogManager.getLogger(this.getClass()).info("===>>> create Bean: PrototypeInjectionOnlyMessageService");
        return new PrototypeInjectionOnlyMessageService();
    }
}