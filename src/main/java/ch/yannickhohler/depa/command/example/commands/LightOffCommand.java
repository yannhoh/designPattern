package ch.yannickhohler.depa.command.example.commands;

import ch.yannickhohler.depa.command.example.third_party_classes.Light;

public class LightOffCommand implements Command{

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override public void execute() {
        light.off();
    }

    @Override public void undo() { light.on(); }
}
