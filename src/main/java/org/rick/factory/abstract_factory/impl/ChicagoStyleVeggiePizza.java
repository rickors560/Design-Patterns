package org.rick.factory.abstract_factory.impl;

import org.rick.factory.abstract_factory.Pizza;

public class ChicagoStyleVeggiePizza implements Pizza {

    public ChicagoStyleVeggiePizza() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return "Chicago Style Veggie Pizza";
    }
}
