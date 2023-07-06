package com.shra012.commander.remote;

public class HotTubCommand implements Command {
    HotTub hottub;

    public HotTubCommand(HotTub hottub) {
        this.hottub = hottub;
    }

    @Override
    public String execute() {
        hottub.on();
        return  hottub.heat() + ' ' + hottub.bubblesOn();
    }

    @Override
    public String undo() {
        hottub.off();
        return  hottub.cool() + ' ' + hottub.bubblesOff();
    }
}