package org.rick.factory.abstract_factory.impl;

import org.rick.factory.abstract_factory.Sandwich;

public class NyStyleSandwich implements Sandwich {
    public NyStyleSandwich() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return "Ny Style Sandwich";
    }
}
