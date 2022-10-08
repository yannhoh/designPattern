package ch.yannickhohler.depa.strategy;

import ch.yannickhohler.depa.strategy.example.character.King;
import ch.yannickhohler.depa.strategy.example.weapon.BowAndArrowBehvaior;

public class Main {
    public static void main(String[] args) {
        King king = new King();

        king.fight();
        king.setWeapon(new BowAndArrowBehvaior());
        king.fight();


    }
}
