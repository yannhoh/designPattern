package ch.yannickhohler.depa.command.example.commands;

import ch.yannickhohler.depa.command.example.third_party_classes.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override public void undo() {
        System.out.println("UNDO STEREO");
    }
}
