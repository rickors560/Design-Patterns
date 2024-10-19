package org.rick.command.impl;

import org.rick.command.Command;

public class FanCommand implements Command {
    @Override
    public void execute() {
        System.out.println("=> Fan Command executed..");
    }
}
