package com.service;

import com.dao.Person;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class PersonService {

    @Resource(name = "Worker")
    private Person person;

    public void showInfo(){
        person.showName();
    }
}
