package com.mruruc.command_pattern;

public class TurnOfLightCommand implements Command{
    private final SwitchLight switchLight;

    public TurnOfLightCommand(SwitchLight switchLight) {
        this.switchLight = switchLight;
    }

    @Override
    public void execute() {
        switchLight.turnOff();
    }

}
