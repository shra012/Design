package com.shra012.commander.remote;

public class RemoteControl {
    private Command[] commands;

    public RemoteControl() {
        commands = new Command[7];
        Command emptyCommand = new EmptyCommand();
        for (int i = 0; i < 7; i++) {
            commands[i] = emptyCommand;
        }
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public String onButtonWasPushed(int slot) {
        return commands[slot].execute();
    }

    public String offButtonWasPushed(int slot) {
        return commands[slot].undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------ Remote Control -------\n");
        for (int i = 0; i < commands.length; i++) {
            sb.append("[slot ").append(i).append("] ").append(commands[i].getClass().getName()).append("    ").append("\n");
        }
        return sb.toString();
    }
}