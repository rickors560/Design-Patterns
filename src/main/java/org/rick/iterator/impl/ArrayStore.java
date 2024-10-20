package org.rick.iterator.impl;

import org.rick.iterator.Iterator;
import org.rick.iterator.Store;

public class ArrayStore implements Store {
    private String[] array;

    public ArrayStore(String[] array) {
        this.array = array;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(this.array);
    }
}
