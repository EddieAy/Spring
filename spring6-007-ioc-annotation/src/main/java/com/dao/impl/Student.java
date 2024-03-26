package com.dao.impl;

import com.dao.Person;
import org.springframework.stereotype.Component;

@Component("Student")
public class Student implements Person {
    @Override
    public void showName() {
        System.out.println("I am student");
    }
}
