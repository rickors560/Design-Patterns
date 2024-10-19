package org.rick.adapter;

import org.rick.adapter.impl.MallardDuck;
import org.rick.adapter.impl.TurkeyAdapter;
import org.rick.adapter.impl.WildTurkey;

public class AdapterPattern {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        testDuck(duck);
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
    }
}
