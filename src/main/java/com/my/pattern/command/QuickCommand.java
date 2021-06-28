package com.my.pattern.command;

/**
 * 自定义-快捷命令
 */
public class QuickCommand implements Command {

    private Command[] commands;

    public QuickCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }
}
