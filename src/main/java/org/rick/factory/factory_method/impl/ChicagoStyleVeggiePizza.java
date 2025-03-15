package org.rick.factory.factory_method.impl;

import org.rick.factory.factory_method.Pizza;

public class ChicagoStyleVeggiePizza implements Pizza {
    @Override
    public String getName() {
        return "Chicago Style Veggie Pizza";
    }
}
