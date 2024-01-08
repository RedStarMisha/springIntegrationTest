package com.example.demo.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/films")
public class Controller {
    FilmService filmService;

    @Autowired
    public Controller(FilmService service) {
        this.filmService = service;
    }

    @GetMapping
    public Film[] getFilms() {
        return filmService.getFilms();
    }
}
