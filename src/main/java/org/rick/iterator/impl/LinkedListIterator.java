package org.rick.iterator.impl;

import org.rick.iterator.Iterator;

import java.util.LinkedList;

public class LinkedListIterator implements Iterator {
    private java.util.Iterator<String> iterator;

    public LinkedListIterator(LinkedList<String> list) {
        this.iterator = list.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override
    public Object next() {
        return this.iterator.next();
    }
}
