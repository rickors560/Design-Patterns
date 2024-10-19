package org.rick.factory.impl;

import org.rick.factory.Pizza;

public class ChicagoStyleCheesePizza implements Pizza {
    public ChicagoStyleCheesePizza() {
    }

    @Override
    public String getName() {
        return "Chicago Style Cheese Pizza";
    }
}
