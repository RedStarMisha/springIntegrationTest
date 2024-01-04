package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest {

    @Autowired
    private DirectChannel directChannel;

    public String getString() {
        System.out.println("asd");
        return "name";
    }
}
