package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    private ServiceTest serviceTest;

    @GetMapping("/hello")
    public String getString() {
        return serviceTest.getString();
    }
}
