package com.shra012.facade.hometheater;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Projector {
    private final String description;
    private final StreamingPlayer player;

    public String on() {
        return description + " on";
    }

    public String off() {
        return description + " off";
    }

    public String wideScreenMode() {
        return description + " in widescreen mode (16x9 aspect ratio)";
    }

    public String tvMode() {
        return description + " in tv mode (4x3 aspect ratio)";
    }

    public String toString() {
        return description;
    }
}