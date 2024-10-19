package org.rick.observer;

import org.rick.observer.impl.ConcreteObserver;
import org.rick.observer.impl.ConcreteSubject;

public class ObserverPattern {
    public static void main(String[] args) {
        var subject = new ConcreteSubject();

        var observer1 = new ConcreteObserver("Alex", subject);
        var observer2 = new ConcreteObserver("Bob", subject);

        subject.notifyObservers();
    }
}
