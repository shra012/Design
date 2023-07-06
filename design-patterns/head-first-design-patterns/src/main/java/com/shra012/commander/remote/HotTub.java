package com.shra012.commander.remote;

public class HotTub {
    boolean on;
    int temperature;

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    @SuppressWarnings("java:S4144")
    public String bubblesOn() {
        if (on) {
            return "Hottub is bubbling!";
        }
        return "Hottub is not bubbling!";
    }

    @SuppressWarnings("java:S4144")
    public String bubblesOff() {
        if (on) {
            return "Hottub is bubbling!";
        }
        return "Hottub is not bubbling!";
    }

    @SuppressWarnings("java:S4144")
    public String jetsOn() {
        if (on) {
            return "Hottub jets are on";
        }
        return "Hottub jets are off";
    }

    @SuppressWarnings("java:S4144")
    public String jetsOff() {
        if (on) {
            return "Hottub jets are on";
        }
        return "Hottub jets are off";
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String heat() {
        temperature = 105;
        return "Hottub is heating to a steaming 105 degrees";
    }

    public String cool() {
        temperature = 98;
        return "Hottub is cooling to 98 degrees";
    }

}
