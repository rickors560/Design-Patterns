package org.rick.strategy.character;

import org.rick.strategy.behavior.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weapon;

    public Character(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
