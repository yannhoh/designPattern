package ch.yannickhohler.depa.strategy.example.weapon;

public class BowAndArrowBehvaior implements WeaponBehavior {
    @Override public void useWeapon() {
        System.out.println("BowAndArrow: BumHeadshot");
    }
}
