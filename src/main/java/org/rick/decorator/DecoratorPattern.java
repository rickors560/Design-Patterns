package org.rick.decorator;

import org.rick.decorator.beverage.Beverage;
import org.rick.decorator.beverage.Espresso;
import org.rick.decorator.beverage.condiment.MilkCondiment;
import org.rick.decorator.beverage.condiment.MochaCondiment;

public class DecoratorPattern {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();

        Beverage milkEspresso = new MilkCondiment(espresso);
        System.out.println(milkEspresso.getDescription());

        Beverage mochaEspresso = new MochaCondiment(espresso);
        System.out.println(mochaEspresso.getDescription());

        Beverage milkMochaEspresso = new MochaCondiment(new MilkCondiment(espresso));
        System.out.println(milkMochaEspresso.getDescription());
    }
}
