package com.shra012.facade.hometheater;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Screen {
    private final String description;

    public String up() {
        return description + " going up";
    }

    public String down() {
        return description + " going down";
    }


    public String toString() {
        return description;
    }
}
