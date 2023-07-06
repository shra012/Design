package com.shra012.facade.hometheater;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PopcornPopper {
    private final String description;

    public String on() {
        return description + " on";
    }

    public String off() {
        return description + " off";
    }

    public String pop() {
        return description + " popping popcorn!";
    }


    public String toString() {
        return description;
    }
}