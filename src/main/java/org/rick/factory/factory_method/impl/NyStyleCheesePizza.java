package org.rick.factory.factory_method.impl;

import org.rick.factory.factory_method.Pizza;

public class NyStyleCheesePizza implements Pizza {
    public NyStyleCheesePizza() {
    }

    @Override
    public String getName() {
        return "NY Style Cheese Pizza";
    }
}
