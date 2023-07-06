package com.shra012.commander.remote;

public class Light {
    private final String location;

    public Light(String location) {
        this.location = location;
    }

    public String on() {
        return location + " light is on";
    }

    public String off() {
        return location + " light is off";
    }
}
