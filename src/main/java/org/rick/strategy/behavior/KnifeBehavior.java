package org.rick.strategy.behavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Knife used.");
    }
}
