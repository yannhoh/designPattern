package ch.yannickhohler.depa.command.example.commands;

public class NoCommand implements Command{

    @Override public void execute() {
        System.out.println("The NoCommand has been executed.");
    }

    @Override public void undo() {
        System.out.println("The NoCommand undo has been executed.");
    }
}
