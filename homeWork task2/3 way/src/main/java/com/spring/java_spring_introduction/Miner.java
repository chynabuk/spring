package com.spring.java_spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("miner")
public class Miner {
    @Autowired
    private Algorithm algorithm;

    public void executeAlgorithm(){
        algorithm.doSmth("Kuba");
    }
}