package com.shra012.facade.hometheater;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TheaterLights {
    private final String description;

    public String on() {
        return description + " on";
    }

    public String off() {
        return description + " off";
    }

    public String dim(int level) {
        return description + " dimming to " + level  + "%";
    }

    public String toString() {
        return description;
    }
}