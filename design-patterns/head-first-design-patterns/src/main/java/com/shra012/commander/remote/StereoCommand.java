package com.shra012.commander.remote;

public class StereoCommand implements Command {
    private final Stereo stereo;
    private final String type;

    public StereoCommand(Stereo stereo, String type) {
        this.stereo = stereo;
        this.type = type;
    }

    @Override
    public String execute() {
        var stereoType = switch (type) {
            case "CD" -> stereo.setCD();
            case "DVD" -> stereo.setDVD();
            default -> stereo.setRadio();
        };
        return stereo.on() + ' ' + stereoType + ' ' + stereo.setVolume(11);
    }

    @Override
    public String undo() {
        return stereo.off();
    }
}
