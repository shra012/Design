package com.shra012.commander.simpleremote;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GarageDoorOpenCommand implements Command {
    private final GarageDoor garageDoor;
    @Override
    public String execute() {
        return garageDoor.up();
    }
}
