package com.spring.java_spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        Algorithm sha256 = new SHA256();

        Miner miner = new Miner(sha256);

        System.out.println("============================");
        miner.executeAlgorithm();


        System.out.println("============================");
        Algorithm ethash = new Ethash();

        miner.setAlgorithm(ethash);
        miner.executeAlgorithm();
    }
}
