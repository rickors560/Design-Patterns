package org.rick.factory.abstract_factory.impl;

import org.rick.factory.abstract_factory.Pizza;

public class NyStyleVeggiePizza implements Pizza {

    public NyStyleVeggiePizza() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return "NY Style Veggie Pizza";
    }
}
