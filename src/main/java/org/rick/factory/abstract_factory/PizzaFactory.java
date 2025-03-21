package org.rick.factory.abstract_factory;

/**
 * @author : ritiksharma
 * @created : 15/03/25
 */

// The abstract factory interface declares a set of methods that
// return different abstract products. These products are called
// a family and are related by a high-level theme or concept.
// Products of one family are usually able to collaborate among
// themselves. A family of products may have several variants,
// but the products of one variant are incompatible with the
// products of another variant.
public interface PizzaFactory {
    public Pizza makePizza(String type);

    public Sandwich makeSandwich();
}
