package com.my.pattern.command;

public class LightCloseCommand implements Command {

    private Light light;

    public LightCloseCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.closeLight();
    }
}
