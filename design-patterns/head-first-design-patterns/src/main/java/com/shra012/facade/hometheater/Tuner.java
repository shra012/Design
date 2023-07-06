package com.shra012.facade.hometheater;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Tuner {
    private final String description;
    private final Amplifier amplifier;
    double frequency;

    public String on() {
        return description + " on";
    }

    public String off() {
        return description + " off";
    }

    public String setFrequency(double frequency) {
        this.frequency = frequency;
        return description + " setting frequency to " + frequency;
    }

    public String setAm() {
        return description + " setting AM mode";
    }

    public String setFm() {
        return description + " setting FM mode";
    }

    public String toString() {
        return description;
    }
}
