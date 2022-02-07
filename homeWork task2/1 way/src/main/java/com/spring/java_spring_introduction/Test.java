package com.spring.java_spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Algorithm sha256 = context.getBean("sha256", Algorithm.class);

        Miner miner = new Miner(sha256);

        System.out.println("============================");
        miner.executeAlgorithm();


        System.out.println("============================");
        Algorithm ethash = context.getBean("ethash", Algorithm.class);

        miner.setAlgorithm(ethash);
        miner.executeAlgorithm();
    }
}
