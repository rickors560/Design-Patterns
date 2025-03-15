package org.rick.factory.abstract_factory.impl;

import org.rick.factory.abstract_factory.Pizza;

public class ChicagoStyleCheesePizza implements Pizza {
    public ChicagoStyleCheesePizza() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return "Chicago Style Cheese Pizza";
    }
}
