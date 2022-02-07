package com.spring.java_spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Miner miner = context.getBean("miner", Miner.class);

        System.out.println("============================");
        miner.executeAlgorithm();
    }
}
