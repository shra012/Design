package com.shra012.commander.remote;

public class Stereo {
    private final String location;

    public Stereo(String location) {
        this.location = location;
    }

    public String on() {
        return location + " stereo is on";
    }

    public String off() {
        return location + " stereo is off";
    }

    public String setCD() {
        return location + " stereo is set for CD input";
    }

    public String setDVD() {
        return location + " stereo is set for DVD input";
    }

    public String setRadio() {
        return location + " stereo is set for Radio";
    }

    public String setVolume(int volume) {
        // code to set the volume
        // valid range: 1-11 (after all 11 is better than 10, right?)
        return location + " stereo volume set to " + volume;
    }
}
