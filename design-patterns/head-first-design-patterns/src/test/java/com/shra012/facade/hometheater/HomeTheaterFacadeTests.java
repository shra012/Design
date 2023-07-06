package com.shra012.facade.hometheater;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class HomeTheaterFacadeTests {
    @Spy
    Amplifier amp = new Amplifier("Amplifier");
    @Spy
    Tuner tuner = new Tuner("AM/FM Tuner", amp);
    @Spy
    StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
    @Spy
    CdPlayer cd = new CdPlayer("CD Player", amp);
    @Spy
    Projector projector = new Projector("Projector", player);
    @Spy
    TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    @Spy
    Screen screen = new Screen("Theater Screen");
    @Spy
    PopcornPopper popper = new PopcornPopper("Popcorn Popper");

    HomeTheaterFacade homeTheater;

    @BeforeEach
    void setup() {
        homeTheater = new HomeTheaterFacade(amp, tuner, cd, player, projector, lights, screen, popper);
    }

    @Test
    void shouldStartAllSystemsToWatchMovie() {
        String movie = "Raiders of the Lost Ark";
        homeTheater.watchMovie(movie);
        verify(popper, times(1)).on();
        verify(popper, times(1)).pop();
        verify(lights, times(1)).dim(10);
        verify(screen, times(1)).down();
        verify(projector, times(1)).on();
        verify(projector, times(1)).wideScreenMode();
        verify(amp, times(1)).on();
        verify(amp, times(1)).setStreamingPlayer(player);
        verify(amp, times(1)).setSurroundSound();
        verify(amp, times(1)).setVolume(5);
        verify(player, times(1)).on();
        verify(player, times(1)).play(movie);
    }

    @Test
    void shouldStopAllSystemsWhenMovieEnds() {
        String movie = "Raiders of the Lost Ark";
        homeTheater.endMovie();
        verify(popper, times(1)).off();
        verify(lights, times(1)).on();
        verify(screen, times(1)).up();
        verify(projector, times(1)).off();
        verify(amp, times(1)).off();
        verify(player, times(1)).stop();
        verify(player, times(1)).off();
    }
}
