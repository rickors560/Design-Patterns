package org.rick.observer.impl;

import org.rick.observer.Observer;
import org.rick.observer.Subject;

public class ConcreteObserver implements Observer {
    private final String name;
    private final Subject subject;

    public ConcreteObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.printf("Observer %s Updated!!%n", this.name);
    }
}
