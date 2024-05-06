package com.mruruc.command_pattern;

public class App {
    public static void main(String[] args) {

        SwitchLight light=new SwitchLight();

        Command turnOn=new TurnOnLightCommand(light);
        Command turnOff=new TurnOfLightCommand(light);

        RemoteControl remote=new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();




    }
}
