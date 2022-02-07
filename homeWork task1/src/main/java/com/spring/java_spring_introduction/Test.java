package com.spring.java_spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorld = context.getBean("hello", HelloWorld.class);
        helloWorld.displayVallue();
    }
}
