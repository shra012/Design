package com.shra012.commander.remote;

public class CeilingFan {
    String location = "";
    int level;
    private static final int HIGH = 2;
    private static final int MEDIUM = 1;
    private static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public String high() {
        // turns the ceiling fan on to high
        level = HIGH;
        return location + " ceiling fan is on high";

    }

    public String medium() {
        // turns the ceiling fan on to medium
        level = MEDIUM;
        return location + " ceiling fan is on medium";
    }

    public String low() {
        // turns the ceiling fan on to low
        level = LOW;
        return location + " ceiling fan is on low";
    }

    public String off() {
        // turns the ceiling fan off
        level = 0;
        return location + " ceiling fan is off";
    }

    public int getSpeed() {
        return level;
    }
}