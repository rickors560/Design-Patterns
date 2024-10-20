package org.rick.composite;

public class MenuItem extends MenuComponent {
    private final String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.printf("Menu Item : %s%n", this.name);
    }
}
