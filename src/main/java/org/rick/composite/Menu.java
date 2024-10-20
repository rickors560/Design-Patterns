package org.rick.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private final String name;
    private List<MenuComponent> components = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        components.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        components.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return components.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.printf("Menu : %s%n", name);

        var iterator = this.components.iterator();

        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }
}
