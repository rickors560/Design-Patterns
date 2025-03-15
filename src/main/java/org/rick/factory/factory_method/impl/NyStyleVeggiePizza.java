package org.rick.factory.factory_method.impl;

import org.rick.factory.factory_method.Pizza;

public class NyStyleVeggiePizza implements Pizza {
    @Override
    public String getName() {
        return "NY Style Veggie Pizza";
    }
}
