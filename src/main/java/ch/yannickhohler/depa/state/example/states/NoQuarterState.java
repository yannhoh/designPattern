package ch.yannickhohler.depa.state.example.states;

import ch.yannickhohler.depa.state.example.GumBallMachine;

public class NoQuarterState implements State {
    @Override public void fillUp() {
        System.out.println("Thx for filling up");
    }

    private final GumBallMachine gumballMachine;

    public NoQuarterState(GumBallMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("Münze wurde eingeworfen.");
        if(gumballMachine.getCount() >= 2) {
            gumballMachine.setState(gumballMachine.getHasQuarterState());
        } else {
            System.out.println("Tut uns leid, wir sind ausverkauft");
            gumballMachine.releaseCoin();
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }


    @Override public void ejectQuarter() {
        System.out.println("Keine Münze eingeworfen");
    }

    @Override public void turnCrank() {
        System.out.println("Sie haben gedreht, aber keine Münze eingeworfen");
    }

    @Override public void dispense() {
        System.out.println("Sie müssen erst eine Münze einwerfen");
    }
}
