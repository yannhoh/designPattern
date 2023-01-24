package ch.yannickhohler.depa.command.example.commands;

import ch.yannickhohler.depa.command.example.third_party_classes.GarageDoor;

public class GarageDoorCloseCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor door) {
        garageDoor = door;
    }

    @Override public void execute() {
        garageDoor.down();
    }

    @Override public void undo() { garageDoor.up(); }
}
