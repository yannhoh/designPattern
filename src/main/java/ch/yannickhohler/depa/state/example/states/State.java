package ch.yannickhohler.depa.state.example.states;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

    void fillUp();

}
