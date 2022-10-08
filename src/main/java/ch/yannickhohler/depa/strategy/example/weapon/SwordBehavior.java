package ch.yannickhohler.depa.strategy.example.weapon;

public class SwordBehavior implements WeaponBehavior{
    @Override public void useWeapon() {
        System.out.println("Sword: ZaggZagg!");
    }
}
