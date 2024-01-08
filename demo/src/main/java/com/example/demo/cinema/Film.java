package com.example.demo.cinema;

import lombok.Getter;

@Getter
public class Film {
    private int num;
    private String name;
    private String time;
    public Film(int i, String name, String time) {
        num = i;
        this.name = name;
        this.time = time;
    }
}
