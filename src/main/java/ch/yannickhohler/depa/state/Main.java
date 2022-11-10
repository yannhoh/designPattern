package ch.yannickhohler.depa.state;

import ch.yannickhohler.depa.state.example.GumBallMachine;

public class Main {

    public static void main(String[] args) {
        var gumballMachine = new GumBallMachine(2);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        System.out.println(gumballMachine.getState());
        gumballMachine.ejectQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.fillUp(10);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        //Machine is empty
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.fillUp(10);
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
    }
}
