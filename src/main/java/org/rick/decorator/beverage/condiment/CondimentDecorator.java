package org.rick.decorator.beverage.condiment;

import org.rick.decorator.beverage.Beverage;

public abstract class CondimentDecorator implements Beverage {
    protected final Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
