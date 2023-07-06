package com.shra012.commander.simpleremote;

import lombok.Getter;
import lombok.Setter;

public class SimpleRemoteControl {
    @Getter
    @Setter
    private Command command;

    public String buttonWasPressed(){
        return command.execute();
    }
}
