package com.shra012.facade.hometheater;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CdPlayer {
    private final String description;
    private final Amplifier amplifier;
    int currentTrack;
    String title;

    public String on() {
        return description + " on";
    }

    public String off() {
        return description + " off";
    }

    public String eject() {
        title = null;
        return description + " eject";
    }

    public String play(String title) {
        this.title = title;
        currentTrack = 0;
        return description + " playing \"" + title + "\"";
    }

    public String play(int track) {
        if (title == null) {
            return description + " can't play track " + currentTrack +
                    ", no cd inserted";
        } else {
            currentTrack = track;
            return description + " playing track " + currentTrack;
        }
    }

    public String stop() {
        currentTrack = 0;
        return description + " stopped";
    }

    public String pause() {
        return description + " paused \"" + title + "\"";
    }

    public String toString() {
        return description;
    }
}
