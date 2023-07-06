package com.shra012.commander.simpleremote;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LightOffCommand implements Command {
    private final Light light;
    @Override
    public String execute() {
        return light.off();
    }
}
