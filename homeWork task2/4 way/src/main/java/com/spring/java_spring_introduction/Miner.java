package com.spring.java_spring_introduction;

public class Miner {
    private Algorithm algorithm;

    public Miner(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void executeAlgorithm(){
        algorithm.doSmth("Kuba");
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }
}