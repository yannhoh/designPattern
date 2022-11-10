package ch.yannickhohler.depa.state.example.states;

import ch.yannickhohler.depa.state.example.GumBallMachine;

public class SoldOutState implements State {

    private final GumBallMachine gumballMachine;

    @Override public void fillUp() {
        System.out.println("Thx for filling up");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public SoldOutState(GumBallMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("Sorry, wir sind ausverkauft. Hier Ihre Münze zurück");
        gumballMachine.releaseCoin();
    }

    @Override public void ejectQuarter() {
        System.out.println("Keine Münze eingeworfen");
    }

    @Override public void turnCrank() {
        System.out.println("Keine Münze eingeworfen. Sind auch ausverkauft");
    }

    @Override public void dispense() {
        System.out.println("Keine Münze eingeworfen. Nicht am Hebel gedreht. Sind auch ausverkauft");
    }
}
