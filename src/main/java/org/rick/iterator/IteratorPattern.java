package org.rick.iterator;

import org.rick.iterator.impl.ArrayStore;
import org.rick.iterator.impl.LinkedListStore;

import java.util.LinkedList;
import java.util.List;

public class IteratorPattern {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(List.of("Hello", "World!"));
        String[] array = linkedList.toArray(new String[0]);

        LinkedListStore linkedListStore = new LinkedListStore(linkedList);
        ArrayStore arrayStore = new ArrayStore(array);

        printIterator(linkedListStore.createIterator());
        System.out.println();
        printIterator(arrayStore.createIterator());
    }

    static void printIterator(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
