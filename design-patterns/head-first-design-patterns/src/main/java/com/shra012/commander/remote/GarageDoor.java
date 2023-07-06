package com.shra012.commander.remote;

public class GarageDoor {
    private final String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public String up() {
        return location + " garage door is up";
    }

    public String down() {
        return location + " garage door is down";
    }

    public String stop() {
        return location + " garage door is stopped";
    }

    public String lightOn() {
        return location + " garage light is on";
    }

    public String lightOff() {
        return location + " garage light is off";
    }
}
