package com.anunnakian;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingConfig {

    private String destination = "Hello World";

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
