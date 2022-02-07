package com.spring.java_spring_introduction;

import org.springframework.stereotype.Component;

@Component("miner")
public class Miner {
    private Algorithm algorithm;

    public Miner(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void executeAlgorithm(){
        algorithm.doSmth("Kuba");
    }
}