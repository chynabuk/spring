package com.spring.java_spring_introduction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hello")
public class HelloWorld {
    @Value("${for_hello}")
    private String value;

    public void displayVallue(){
        System.out.println(value);
    }
}
