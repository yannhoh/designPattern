package ch.yannickhohler.depa.state.example;

import ch.yannickhohler.depa.state.example.states.HasQuarterState;
import ch.yannickhohler.depa.state.example.states.NoQuarterState;
import ch.yannickhohler.depa.state.example.states.SoldOutState;
import ch.yannickhohler.depa.state.example.states.SoldState;
import ch.yannickhohler.depa.state.example.states.State;
import ch.yannickhohler.depa.state.example.states.WinnerState;

public class GumBallMachine {

    private State soldOutState;
    private State noQuarterState;
    private State winnerState;
    private State hasQuarterState;
    private State soldState;

    private State state;

    public int count;

    public GumBallMachine(int numberGumballs) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.winnerState = new WinnerState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);

        this.count = numberGumballs;

        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void releaseBall() {
        System.out.println("Ein Kaugummi wird ausgegeben ...");
        if (count > 0) {
            count--;
        }
    }

    public void releaseCoin() {
        System.out.println("Coin wird ausgegeben");
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }

    public void fillUp(int amount) {
        assert amount < 0;
        count += amount;
        state.fillUp();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
