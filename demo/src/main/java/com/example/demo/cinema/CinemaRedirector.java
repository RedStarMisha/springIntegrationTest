package com.example.demo.cinema;

import org.springframework.integration.annotation.Router;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component("cinemaRedirector")
public class CinemaRedirector {
    private static final String CINEMA_EGYPTIAN_CHANNEL = "egyptianRequestChannel";
    private static final String CINEMA_PANTAGES_CHANNEL = "pantagesRequestChannel";
    private static final String QUIT_REQUEST_CHANNEL = "quitRequestChannel";

    @Router
    public String redirectMessage(Message<String> msg) {
        String payload = msg.getPayload();

        if ("1".equals(payload)) {
            return CINEMA_EGYPTIAN_CHANNEL;
        }
        else if ("2".equals(payload)) {
            return CINEMA_PANTAGES_CHANNEL;
        }

        return QUIT_REQUEST_CHANNEL;
    }
}
