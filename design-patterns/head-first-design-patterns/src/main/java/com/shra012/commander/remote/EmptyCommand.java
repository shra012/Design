package com.shra012.commander.remote;

public class EmptyCommand implements Command {
    @Override
    public String execute() {
        return null;
    }

    @Override
    public String undo() {
        return null;
    }
}
