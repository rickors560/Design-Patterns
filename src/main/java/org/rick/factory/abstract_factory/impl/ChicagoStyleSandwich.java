package org.rick.factory.abstract_factory.impl;

import org.rick.factory.abstract_factory.Sandwich;

public class ChicagoStyleSandwich implements Sandwich {
    public ChicagoStyleSandwich() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return "Chicago Style Sandwich";
    }
}
