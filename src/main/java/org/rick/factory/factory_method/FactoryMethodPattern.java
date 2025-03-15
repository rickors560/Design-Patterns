package org.rick.factory.factory_method;

import org.rick.factory.factory_method.impl.ChicagoPizzaStore;
import org.rick.factory.factory_method.impl.NyPizzaStore;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NyPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        nyPizzaStore.orderPizza("cheese");
        chicagoPizzaStore.orderPizza("cheese");

        System.out.println();

        nyPizzaStore.orderPizza("veggie");
        chicagoPizzaStore.orderPizza("veggie");
    }
}
