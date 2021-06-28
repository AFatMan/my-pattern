package com.my.pattern.command;

// 遥控器
public class ControlPanel {

    private Command[] commands;
    private int size = 9;

    {
        commands = new Command[size];
        for (int i = 0, commandsLength = commands.length; i < commandsLength; i++) {
            commands[i] = new NullCommand();
        }
    }

    void setCommand(int i,Command command){
        commands[i] = command;
    }

    void keyPress(int i){
        commands[i].execute();
    }
}
