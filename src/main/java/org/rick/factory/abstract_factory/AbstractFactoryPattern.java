package org.rick.factory.abstract_factory;

import org.rick.factory.abstract_factory.impl.ChicagoPizzaFactory;
import org.rick.factory.abstract_factory.impl.NyPizzaFactory;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        PizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
        PizzaFactory nyPizzaFactory = new NyPizzaFactory();

        chicagoPizzaFactory.makePizza("cheese");
        chicagoPizzaFactory.makePizza("veggie");
        chicagoPizzaFactory.makeSandwich();

        System.out.println();

        nyPizzaFactory.makePizza("cheese");
        nyPizzaFactory.makePizza("veggie");
        nyPizzaFactory.makeSandwich();
    }
}
