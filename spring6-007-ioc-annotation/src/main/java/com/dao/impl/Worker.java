package com.dao.impl;

import com.dao.Person;
import org.springframework.stereotype.Component;

@Component("Worker")
public class Worker implements Person {
    @Override
    public void showName() {
        System.out.println("I am worker");
    }
}
