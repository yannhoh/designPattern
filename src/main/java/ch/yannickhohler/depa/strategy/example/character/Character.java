package ch.yannickhohler.depa.strategy.example.character;

import ch.yannickhohler.depa.strategy.example.weapon.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weapon;

    public void fight() {
        System.out.print(this.getClass().getName().substring(41) + " fights with ");
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weaponBehavior) {
        weapon = weaponBehavior;
    }
}
