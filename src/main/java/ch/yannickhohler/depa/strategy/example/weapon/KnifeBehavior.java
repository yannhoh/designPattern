package ch.yannickhohler.depa.strategy.example.weapon;

public class KnifeBehavior implements WeaponBehavior{
    @Override public void useWeapon() {
        System.out.println("Knife: StichStich!");
    }
}
