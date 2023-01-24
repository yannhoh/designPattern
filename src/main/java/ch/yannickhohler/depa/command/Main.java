package ch.yannickhohler.depa.command;

import ch.yannickhohler.depa.command.example.RemoteControl;
import ch.yannickhohler.depa.command.example.SimpleRemoteControl;
import ch.yannickhohler.depa.command.example.commands.CeilingFanHighCommand;
import ch.yannickhohler.depa.command.example.commands.Command;
import ch.yannickhohler.depa.command.example.commands.GarageDoorCloseCommand;
import ch.yannickhohler.depa.command.example.commands.GarageDoorOpenCommand;
import ch.yannickhohler.depa.command.example.commands.LightOffCommand;
import ch.yannickhohler.depa.command.example.commands.LightOnCommand;
import ch.yannickhohler.depa.command.example.commands.MacroCommand;
import ch.yannickhohler.depa.command.example.commands.StereoOffCommand;
import ch.yannickhohler.depa.command.example.commands.StereoOnWithCDCommand;
import ch.yannickhohler.depa.command.example.third_party_classes.CeilingFan;
import ch.yannickhohler.depa.command.example.third_party_classes.GarageDoor;
import ch.yannickhohler.depa.command.example.third_party_classes.Light;
import ch.yannickhohler.depa.command.example.third_party_classes.Stereo;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemote = new SimpleRemoteControl();
        Light light                      = new Light();
        LightOnCommand lightOn           = new LightOnCommand(light);
        simpleRemote.setCommand(lightOn);
        simpleRemote.buttonWasPressed();

        GarageDoor garageDoor                 = new GarageDoor();
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        simpleRemote.setCommand(doorOpenCommand);
        simpleRemote.buttonWasPressed();

        RemoteControl remote    = new RemoteControl();
        GarageDoor door         = new GarageDoor();
        GarageDoorOpenCommand doorOpenCommand1      = new GarageDoorOpenCommand(door);
        GarageDoorCloseCommand doorCloseCommand1    = new GarageDoorCloseCommand(door);
        remote.setCommand(0,doorOpenCommand1, doorCloseCommand1);
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);

        Stereo stereo                               = new Stereo();
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand           = new StereoOffCommand(stereo);
        remote.setCommand(1, stereoOnWithCDCommand, stereoOffCommand);
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);

        // LAMBDA Works only if Interface Command has one method (execute)
//        remote.setCommand(2, () -> light.on(), () -> light.off()); // same
//        remote.setCommand(2, light::on, light::off);               // same
//        remote.onButtonWasPushed(2);
//        remote.offButtonWasPushed(2);

        //UNDO
        System.out.println("UNDO: ");
        remote.onButtonWasPushed(0);
        remote.undoButtonWasPushed();
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();

        remote.onButtonWasPushed(1);
        remote.undoButtonWasPushed();

        // Comand with State
        System.out.println("FAN: ");
        CeilingFan ceilingFan = new CeilingFan("Kitchen");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        remote.setCommand(3, ceilingFanHighCommand, null);
        remote.onButtonWasPushed(3);
        remote.undoButtonWasPushed();

        // MACRO Command
        Light light2 = new Light();
        Stereo stereo2 = new Stereo();
        LightOnCommand lightOnCommand2 = new LightOnCommand(light2);
        StereoOnWithCDCommand stereoOnCommand = new StereoOnWithCDCommand(stereo2);
        LightOffCommand lightOffCommand = new LightOffCommand(light2);
        StereoOffCommand stereoOffCommand2 = new StereoOffCommand(stereo2);

        Command[] partyOn = {lightOnCommand2, stereoOnCommand};
        Command[] partyOff = {lightOffCommand, stereoOffCommand2};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        remote.setCommand(4, partyOnMacro, partyOffMacro);
        System.out.println("PARTY:");
        remote.onButtonWasPushed(4);
        remote.undoButtonWasPushed();
    }
}
