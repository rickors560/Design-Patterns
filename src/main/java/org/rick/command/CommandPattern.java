package org.rick.command;

import org.rick.command.impl.FanCommand;
import org.rick.command.impl.LightCommand;

public class CommandPattern {
    public static void main(String[] args) {
        Command fanCommand = new FanCommand();
        Command lightCommand = new LightCommand();

        Remote remote = new Remote(fanCommand);
        remote.action();

        System.out.println();

        remote.setCommand(lightCommand);
        remote.action();
    }
}
