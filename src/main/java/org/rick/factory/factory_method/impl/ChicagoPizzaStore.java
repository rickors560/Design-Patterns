package org.rick.factory.factory_method.impl;

import org.rick.factory.factory_method.Pizza;
import org.rick.factory.factory_method.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza makePizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
