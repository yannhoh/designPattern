package ch.yannickhohler.depa.strategy.example.character;

import ch.yannickhohler.depa.strategy.example.weapon.KnifeBehavior;

public class King extends Character {

    public King() {
        this.weapon = new KnifeBehavior();
    }

}
