package ch.yannickhohler.depa.command.example.commands;

import ch.yannickhohler.depa.command.example.third_party_classes.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    private final GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor door) {
        garageDoor = door;
    }
    @Override public void execute() {
        garageDoor.up();
    }
    @Override public void undo() {
        garageDoor.down();
    }
}
