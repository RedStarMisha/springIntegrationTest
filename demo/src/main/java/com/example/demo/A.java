package com.example.demo;

import org.springframework.stereotype.Service;

@Service("aService")
public class A {
    public Animal process(Animal animal) {
        System.out.println("A is processing animal");
        return animal;
    }
}
