package com.tutospring.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tutospring.helloworld.service.BusinessService;

@SpringBootTest
class HelloworldApplicationTests {

    @Autowired
    private BusinessService bs;

    @Test
    void contextLoads() {
    }


    @Test
    void testGetHelloWorld(){

        String expected = "Hello World!";

        String result = bs.getHelloWorld().getValue();

        assertEquals(expected, result);
    }

}
