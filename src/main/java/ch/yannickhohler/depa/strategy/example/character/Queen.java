package ch.yannickhohler.depa.strategy.example.character;

import ch.yannickhohler.depa.strategy.example.weapon.KnifeBehavior;

public class Queen extends Character {

    public Queen(){
        weapon = new KnifeBehavior();
    }
}
