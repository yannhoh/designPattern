package ch.yannickhohler.depa.command.example;

import ch.yannickhohler.depa.command.example.commands.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
