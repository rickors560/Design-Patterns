package org.rick.decorator.beverage.condiment;

import org.rick.decorator.beverage.Beverage;

public class MochaCondiment extends CondimentDecorator {
    public MochaCondiment(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription() + ", Mocha";
    }
}
