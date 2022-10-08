package ch.yannickhohler.depa.strategy.example.character;

import ch.yannickhohler.depa.strategy.example.weapon.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weapon = new AxeBehavior();
    }
}
