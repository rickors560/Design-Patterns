package org.rick.factory.factory_method;

// The creator class declares the factory method that must
// return an object of a product class. The creator's subclasses
// usually provide the implementation of this method.
public abstract class PizzaStore {
    protected abstract Pizza makePizza(String type);

    // Note that, despite its name, the creator's primary
    // responsibility isn't creating products. It usually
    // contains some core business logic that relies on product
    // objects returned by the factory method. Subclasses can
    // indirectly change that business logic by overriding the
    // factory method and returning a different type of product
    // from it.
    public Pizza orderPizza(String type) {
        Pizza pizza = makePizza(type);
        System.out.println("Ordered %s".formatted(pizza.getName()));
        return pizza;
    }
}
