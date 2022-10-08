package ch.yannickhohler.depa.strategy.example.weapon;

public class AxeBehavior implements WeaponBehavior{
    @Override public void useWeapon() {
        System.out.println("Axe: SchwingSchwung!");
    }
}
