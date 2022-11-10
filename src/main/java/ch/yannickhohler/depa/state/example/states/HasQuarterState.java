package ch.yannickhohler.depa.state.example.states;

import ch.yannickhohler.depa.state.example.GumBallMachine;

import java.util.Random;

public class HasQuarterState implements State {

    private final GumBallMachine gumballMachine;

    public HasQuarterState(GumBallMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("Sie haben schon eine Münze eingeworfen");
    }

    @Override public void ejectQuarter() {
        gumballMachine.releaseCoin();
        System.out.println("Voila, Ihre Münze zurück");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override public void fillUp() {
        System.out.println("Thx for filling up");
    }

    @Override public void turnCrank() {
        System.out.println("Sie haben gedreht, hoffen Sie auf Ihr Glück..");
        if(new Random().nextInt(10) == 0) {                                             //10% Chance
            System.out.println("Glückwunsch, Sie haben gewonnen, Sie bekommen 2 Kaugummis!");
            gumballMachine.setState(gumballMachine.getWinnerState());
            gumballMachine.turnCrank();
        } else {
            System.out.println("Leider nein, vielleicht haben Sie nächstes mal mehr Glück");
            gumballMachine.setState(gumballMachine.getSoldState());
            gumballMachine.turnCrank();
        }
    }

    @Override public void dispense() {
        System.out.println("Drehen Sie bitte zuerst an der Kurbel.");
    }
}
