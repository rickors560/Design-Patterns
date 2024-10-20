package org.rick.iterator.impl;

import org.rick.iterator.Iterator;
import org.rick.iterator.Store;

import java.util.LinkedList;

public class LinkedListStore implements Store {

    private final LinkedList<String> list;

    public LinkedListStore(LinkedList<String> list) {
        this.list = list;
    }

    @Override
    public Iterator createIterator() {
        return new LinkedListIterator(this.list);
    }
}
