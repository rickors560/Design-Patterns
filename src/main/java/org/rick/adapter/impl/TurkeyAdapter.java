package org.rick.adapter.impl;

import org.rick.adapter.Duck;
import org.rick.adapter.Turkey;

public class TurkeyAdapter implements Duck {

    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
