package org.rick.factory.abstract_factory.impl;

import org.rick.factory.abstract_factory.Pizza;
import org.rick.factory.abstract_factory.PizzaFactory;
import org.rick.factory.abstract_factory.Sandwich;

/**
 * @author : ritiksharma
 * @created : 15/03/25
 */
public class ChicagoPizzaFactory implements PizzaFactory {
    @Override
    public Pizza makePizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }

    @Override
    public Sandwich makeSandwich() {
        return new ChicagoStyleSandwich();
    }
}
