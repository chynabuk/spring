package com.spring.java_spring_introduction;

import org.springframework.stereotype.Component;

@Component("algorithm")
public interface Algorithm {
    void doSmth(String text);
}
