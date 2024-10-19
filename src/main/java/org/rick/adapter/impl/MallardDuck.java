package org.rick.adapter.impl;

import org.rick.adapter.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}
