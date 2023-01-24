package ch.yannickhohler.depa.command.example.commands;

import ch.yannickhohler.depa.command.example.third_party_classes.Light;

public class LightOnCommand implements Command{

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override public void execute() {
        light.on();
    }

    @Override public void undo() { light.off(); }
}
