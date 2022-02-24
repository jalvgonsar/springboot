package com.example.demo;

public class PrototypeInjectionOnlyMessageService {

    public String getMessage() {
        return "("+ this.hashCode()+ "): PrototypeInjectionOnlyMessageService::getMessage()";
    }
}