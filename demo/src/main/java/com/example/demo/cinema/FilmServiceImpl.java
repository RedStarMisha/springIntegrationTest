package com.example.demo.cinema;

import org.springframework.stereotype.Service;

@Service("filmService")
public class FilmServiceImpl implements FilmService{
    @Override
    public Film[] getFilms() {
        Film film1 = new Film(1, "Bladerunner", "10am");
        Film film2 = new Film(2, "Gran Torino", "12pm");

        return new Film[]{film1, film2};
    }
}
