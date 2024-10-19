package org.rick.decorator.beverage.condiment;

import org.rick.decorator.beverage.Beverage;

public class MilkCondiment extends CondimentDecorator {
    public MilkCondiment(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription() + ", Milk";
    }
}
