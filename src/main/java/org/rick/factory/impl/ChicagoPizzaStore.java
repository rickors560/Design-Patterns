package org.rick.factory.impl;

import org.rick.factory.Pizza;
import org.rick.factory.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza orderPizza(String type) {
        var pizza = switch (type){
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };

        System.out.println("Ordered %s".formatted(pizza.getName()));
        return pizza;
    }
}
