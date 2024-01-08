package com.example.demo.cinema;

import org.springframework.beans.factory.annotation.Autowired;

@Endpoint
public class FilmEndpoint {
    @Autowired
    private FilmService filmService;

    @PayloadRoot(localPart="filmRequest", namespace="http://www.xpadro.spring.samples.com/films")
    public @ResponsePayload FilmResponse getFilms() {
        return buildResponse();
    }

    private FilmResponse buildResponse() {
        FilmResponse response = new FilmResponse();

        for (Film film : filmService.getFilms()) {
            response.getFilm().add(film);
        }

        return response;
    }
}
