package org.rick.factory;

import org.rick.factory.impl.ChicagoPizzaStore;
import org.rick.factory.impl.NyPizzaStore;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NyPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        nyPizzaStore.orderPizza("cheese");
        chicagoPizzaStore.orderPizza("cheese");

        nyPizzaStore.orderPizza("veggie");
        chicagoPizzaStore.orderPizza("veggie");
    }
}
