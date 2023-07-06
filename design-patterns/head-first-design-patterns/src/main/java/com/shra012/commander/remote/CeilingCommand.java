package com.shra012.commander.remote;

public class CeilingCommand implements Command {
    private final CeilingFan ceilingFan;

    public CeilingCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public String execute() {
        return ceilingFan.high();
    }

    @Override
    public String undo() {
        return ceilingFan.low();
    }
}
