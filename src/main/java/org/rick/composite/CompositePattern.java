package org.rick.composite;

public class CompositePattern {
    // Allows to compose objects into tree structures to represent hierarchy.
    // And lets client treat individual objects and compositions of objects uniformly.
    public static void main(String[] args) {
        MenuComponent allMenu = new Menu("All Menu");

        MenuComponent lunchMenu = new Menu("Lunch Menu");
        MenuComponent dinnerMenu = new Menu("Dinner Menu");

        lunchMenu.add(new MenuItem("Burger"));
        lunchMenu.add(new MenuItem("Pasta"));

        dinnerMenu.add(new MenuItem("Mac & Cheese"));
        dinnerMenu.add(new MenuItem("Ratatouille"));

        allMenu.add(lunchMenu);
        allMenu.add(dinnerMenu);

        allMenu.print();
    }
}
