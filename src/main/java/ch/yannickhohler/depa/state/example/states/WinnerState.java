package ch.yannickhohler.depa.state.example.states;

import ch.yannickhohler.depa.state.example.GumBallMachine;

public class WinnerState implements State {

    private final GumBallMachine gumballMachine;

    @Override public void fillUp() {
        System.out.println("Thx for filling up");
    }

    public WinnerState(GumBallMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("Sie haben bereits eine Münze eingeworfen.");
    }

    @Override public void ejectQuarter() {
        System.out.println("Kauf abgeschlossen, Sie haben schon an der Kurbel gedreht.");
    }

    @Override public void turnCrank() {
        dispense();
    }

    @Override public void dispense() {
        if(gumballMachine.getCount() >= 2) {
            System.out.println("Voila, Ihre 2 Kaugummis. Danke für Ihren Kauf. See ya.");
            gumballMachine.releaseBall();
            gumballMachine.releaseBall();
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else if(gumballMachine.getCount() > 0) {
            System.out.println("Ups, wir haben nurnoch einen Kaugummi. Jetzt sind wie ausverkauft");
            gumballMachine.releaseBall();
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            System.out.println("Ups, wir sind ausverkauft. Lassen Sie Geld wieder auswerfen");
            gumballMachine.setState(gumballMachine.getHasQuarterState());
        }
    }
}
