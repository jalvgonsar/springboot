package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestConfig
public class SingletonMessageServiceV2Test {

    
    @Test
    void testGetMessage(@Autowired  SingletonMessageServiceV2 singletonMessageServiceV2) {
        assertTrue(singletonMessageServiceV2.getMessage().length() > 0);
        LogManager.getLogger(this.getClass()).info("===>>> message: " + singletonMessageServiceV2.getMessage());
    }


}
