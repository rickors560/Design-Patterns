package org.rick.iterator.impl;

import org.rick.iterator.Iterator;

public class ArrayIterator implements Iterator {
    private final String[] array;
    private int position = 0;

    public ArrayIterator(String[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (position >= array.length || array[position] == null)
            return false;
        return true;
    }

    @Override
    public Object next() {
        String str = array[position];
        position++;
        return str;
    }
}
