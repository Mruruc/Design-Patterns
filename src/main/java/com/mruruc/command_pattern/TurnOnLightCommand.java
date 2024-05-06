package com.mruruc.command_pattern;

public class TurnOnLightCommand implements Command {
    private SwitchLight light;

    public TurnOnLightCommand(SwitchLight light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
