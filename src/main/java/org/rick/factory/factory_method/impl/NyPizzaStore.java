package org.rick.factory.factory_method.impl;

import org.rick.factory.factory_method.Pizza;
import org.rick.factory.factory_method.PizzaStore;

public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza makePizza(String type) {
        return switch (type) {
            case "cheese" -> new NyStyleCheesePizza();
            case "veggie" -> new NyStyleVeggiePizza();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
