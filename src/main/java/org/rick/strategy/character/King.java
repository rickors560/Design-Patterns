package org.rick.strategy.character;

import org.rick.strategy.behavior.WeaponBehavior;

public class King extends Character{

    public King(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        super.weapon.useWeapon();
    }
}
