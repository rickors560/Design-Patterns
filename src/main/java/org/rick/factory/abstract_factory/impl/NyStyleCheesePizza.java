package org.rick.factory.abstract_factory.impl;

import org.rick.factory.abstract_factory.Pizza;

public class NyStyleCheesePizza implements Pizza {
    public NyStyleCheesePizza() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return "NY Style Cheese Pizza";
    }
}
