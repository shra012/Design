package com.shra012.command.remote;

import com.shra012.commander.remote.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RemoteTests {

    RemoteControl remote = new RemoteControl();

    LightCommand livingRoomLight;
    LightCommand diningLight;
    GarageDoorCommand stiltGarageDoor;
    CeilingCommand livingRoomCeilingFan;
    StereoCommand livingRoomCDStereo;

    @BeforeAll
    void setup() {
        Light livingRoom = new Light("living room");
        livingRoomLight = new LightCommand(livingRoom);
        Light dining = new Light("dining");
        diningLight = new LightCommand(dining);
        GarageDoor garageDoor = new GarageDoor("stilt");
        stiltGarageDoor = new GarageDoorCommand(garageDoor);
        CeilingFan ceilingFan = new CeilingFan("living room");
        livingRoomCeilingFan = new CeilingCommand(ceilingFan);
        Stereo stereo = new Stereo("living room");
        livingRoomCDStereo = new StereoCommand(stereo, "CD");
        remote.setCommand(0, livingRoomLight);
        remote.setCommand(1, diningLight);
        remote.setCommand(2, stiltGarageDoor);
        remote.setCommand(3, livingRoomCeilingFan);
        remote.setCommand(4, livingRoomCDStereo);

    }

    @Test
    void shouldTurnOnLivingRoomLight() {
        Assertions.assertEquals("living room light is on", remote.onButtonWasPushed(0));
    }

    @Test
    void shouldTurnOffLivingRoomLight() {
        Assertions.assertEquals("living room light is off", remote.offButtonWasPushed(0));
    }

    @Test
    void shouldTurnOnDiningRoomLight() {
        Assertions.assertEquals("dining light is on", remote.onButtonWasPushed(1));
    }

    @Test
    void shouldTurnOffDiningRoomLight() {
        Assertions.assertEquals("dining light is off", remote.offButtonWasPushed(1));
    }

    @Test
    void shouldOpenGarageDoor() {
        Assertions.assertEquals("stilt garage door is up", remote.onButtonWasPushed(2));
    }

    @Test
    void shouldCloseGarageDoor() {
        Assertions.assertEquals("stilt garage door is down", remote.offButtonWasPushed(2));
    }

    @Test
    void shouldHighLivingRoomFan() {
        Assertions.assertEquals("living room ceiling fan is on high", remote.onButtonWasPushed(3));
    }

    @Test
    void shouldLowLivingRoomFan() {
        Assertions.assertEquals("living room ceiling fan is on low", remote.offButtonWasPushed(3));
    }

    @Test
    void shouldTurnOnLivingRoomStereo() {
        Assertions.assertEquals("living room stereo is on living room stereo is set for CD input living room stereo volume set to 11", remote.onButtonWasPushed(4));
    }

    @Test
    void shouldTurnOffLivingRoomStereo() {
        Assertions.assertEquals("living room stereo is off", remote.offButtonWasPushed(4));
    }

}
