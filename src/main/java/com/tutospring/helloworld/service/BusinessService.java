package com.tutospring.helloworld.service;

import com.tutospring.helloworld.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }

}
