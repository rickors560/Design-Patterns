package org.rick.factory.factory_method.impl;

import org.rick.factory.factory_method.Pizza;

public class ChicagoStyleCheesePizza implements Pizza {
    public ChicagoStyleCheesePizza() {
    }

    @Override
    public String getName() {
        return "Chicago Style Cheese Pizza";
    }
}
