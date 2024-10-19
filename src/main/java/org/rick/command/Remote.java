package org.rick.command;

public class Remote {
    private Command command;

    public Remote(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        System.out.println("Preparing for the command to run..");
        command.execute();
        System.out.println("Command ran successfully....");
    }
}
