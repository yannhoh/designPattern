package ch.yannickhohler.depa.command.example;

import ch.yannickhohler.depa.command.example.commands.Command;
import ch.yannickhohler.depa.command.example.commands.NoCommand;

public class RemoteControl {
    int amountOfCommands = 7;
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands  = new Command[amountOfCommands];
        offCommands = new Command[amountOfCommands];
        Command noCommand = new NoCommand();
        undoCommand = noCommand;
        for (int i = 0; i < amountOfCommands; i++) {
            onCommands[i]  = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if(slot > amountOfCommands) throw new IllegalArgumentException();
        if(slot < 0)                throw new IllegalArgumentException();

        onCommands[slot]  = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        Command command = onCommands[slot];
        command.execute();
        undoCommand = command;
    }

    public void offButtonWasPushed(int slot) {
        Command command = offCommands[slot];
        command.execute();
        undoCommand = command;
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Fernsteuerung -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[Platz " + i + "] " + onCommands[i].getClass().getName()
                    + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
