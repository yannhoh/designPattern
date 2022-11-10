package ch.yannickhohler.depa.state.example.states;

import ch.yannickhohler.depa.state.example.GumBallMachine;

public class SoldState implements State {

    private final GumBallMachine gumballMachine;

    public SoldState(GumBallMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("Simmer down, Kaugummi ist auf dem Weg.");
    }

    @Override public void ejectQuarter() {
        System.out.println("Kauf schon abgeschlossen.");
    }

    @Override public void turnCrank() {
        dispense();
    }

    @Override public void fillUp() {
        System.out.println("Thx for filling up");
    }

    @Override public void dispense() {
        if(gumballMachine.getCount() > 0) {
            System.out.println("Voila, Ihr Kaugummi. Bis zum nächsten mal.");
            gumballMachine.releaseBall();
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Ups, wir sind ausverkauft. Lassen Sie Ihr Geld wieder auswerfen");
            gumballMachine.setState(gumballMachine.getHasQuarterState());
        }
    }
}
