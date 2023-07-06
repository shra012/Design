package com.shra012.commander.remote;

public class GarageDoorCommand implements Command {
    private final GarageDoor garageDoor;

    public GarageDoorCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public String execute() {
        return garageDoor.up();
    }

    @Override
    public String undo() {
        return garageDoor.down();
    }
}
