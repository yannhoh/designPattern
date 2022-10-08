package ch.yannickhohler.depa.strategy.example.character;

import ch.yannickhohler.depa.strategy.example.weapon.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        weapon = new SwordBehavior();
    }
}
