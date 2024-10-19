package org.rick.factory.impl;

import org.rick.factory.Pizza;

public class NyStyleCheesePizza implements Pizza {
    public NyStyleCheesePizza() {
    }

    @Override
    public String getName() {
        return "NY Style Cheese Pizza";
    }
}
