package org.rick.command.impl;

import org.rick.command.Command;

public class LightCommand implements Command {
    @Override
    public void execute() {
        System.out.println("=> Light Command executed");
    }
}
