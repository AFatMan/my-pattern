package com.my.pattern.command;

public class Door {

    private String doorStatus;

    public void closeDoor() {
        this.doorStatus = "克里斯关下门";
    }

    public void openDoor() {
        this.doorStatus = "克里斯开下门";
    }

    public String getDoorStatus() {
        return doorStatus;
    }

    @Override
    public String toString() {
        return "Door{" +
                "doorStatus='" + doorStatus + '\'' +
                '}';
    }
}
