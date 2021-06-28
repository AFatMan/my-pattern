package com.my.pattern.command;

public class Light {
    private String lightStatus;

    public void closeLight() {
        this.lightStatus = "克里斯关下门";
    }

    public void openLight() {
        this.lightStatus = "克里斯开下门";
    }

    public String getLightStatus() {
        return lightStatus;
    }

    @Override
    public String toString() {
        return "Light{" +
                "lightStatus='" + lightStatus + '\'' +
                '}';
    }
}
