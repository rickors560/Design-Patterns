package org.rick.template;

public abstract class CaffeineBeverage {

    // This is the template method, which encapsulates the skeleton of a algorithm.
    public final void prepareRecipe() {
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling Water");
    }

    public void pourInCup() {
        System.out.println("Pouring in a cup");
    }
}
