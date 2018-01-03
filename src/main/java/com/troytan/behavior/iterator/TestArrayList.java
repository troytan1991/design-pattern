package com.troytan.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestArrayList<E> extends ArrayList<E> {

    private static final long serialVersionUID = 1L;

    public Iterator<E> createIterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<E> {

        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor != size();
        }

        @Override
        public E next() {
            if (cursor > size()) {
                throw new NoSuchElementException();
            }
            return TestArrayList.this.get(cursor++);
        }

    }
}
