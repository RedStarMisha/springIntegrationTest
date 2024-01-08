package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest {

    private String a = "hello";

    @Autowired
    private DirectChannel directChannel;

    public String getString() {
        System.out.println("asd");
        return a;
    }

    public void change() {
        a = "hi";
    }

    @MessagingGateway
    public interface I {
        @Gateway(requestChannel = "animalFlow.input")
        void process(Animal animal);
    }
    // канал DirectChannel с именем animalFlow.input создается автоматически
    @Bean
    public IntegrationFlow animalFlow() {
        return flow -> flow
                .handle("bService", "process")
                .handle("cService", "process")
                .handle("aService", "process")
                .channel("outputChannel");
    }
}
