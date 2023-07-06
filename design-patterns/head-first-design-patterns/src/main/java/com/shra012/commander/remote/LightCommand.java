package com.shra012.commander.remote;

public class LightCommand implements Command {
    Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.on();
    }

    @Override
    public String undo() {
        return light.off();
    }
}
