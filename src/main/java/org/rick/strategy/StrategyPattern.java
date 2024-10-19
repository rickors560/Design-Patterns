package org.rick.strategy;

import org.rick.strategy.behavior.KnifeBehavior;
import org.rick.strategy.behavior.SwordBehavior;
import org.rick.strategy.character.King;

public class StrategyPattern {
    public static void main(String[] args) {
        var sword = new SwordBehavior();
        var knife = new KnifeBehavior();

        var king = new King(sword);
        king.fight();

        king.setWeapon(knife);
        king.fight();
    }
}
