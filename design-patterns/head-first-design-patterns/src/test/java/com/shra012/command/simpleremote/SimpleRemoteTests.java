package com.shra012.command.simpleremote;

import com.shra012.commander.simpleremote.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleRemoteTests {

    SimpleRemoteControl simpleRemote = new SimpleRemoteControl();
    Light light = new Light();

    @Test
    void shouldTurnOnLight() {
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        simpleRemote.setCommand(lightOnCommand);
        Assertions.assertEquals("light on", simpleRemote.buttonWasPressed());
    }

    @Test
    void shouldTurnOffLight() {
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        simpleRemote.setCommand(lightOffCommand);
        Assertions.assertEquals("light off", simpleRemote.buttonWasPressed());
    }

    @Test
    void shouldOpenGarageDoor() {
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        simpleRemote.setCommand(garageDoor::up);
        Assertions.assertEquals("Garage Door is Open", simpleRemote.buttonWasPressed());
    }
}