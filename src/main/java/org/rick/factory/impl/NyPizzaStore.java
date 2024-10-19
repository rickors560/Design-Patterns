package org.rick.factory.impl;

import org.rick.factory.Pizza;
import org.rick.factory.PizzaStore;

public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza orderPizza(String type) {
        var pizza = switch (type) {
            case "cheese" -> new NyStyleCheesePizza();
            case "veggie" -> new NyStyleVeggiePizza();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };

        System.out.println("Ordered %s".formatted(pizza.getName()));
        return pizza;
    }
}
