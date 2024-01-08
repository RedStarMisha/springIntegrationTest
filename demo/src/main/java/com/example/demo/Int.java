package com.example.demo;

import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface Int {

    String echo(String string);
}
