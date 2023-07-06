package com.shra012.adapter.iterenum;

import lombok.RequiredArgsConstructor;

import java.util.Enumeration;
import java.util.Iterator;

@SuppressWarnings("java:S1150")
@RequiredArgsConstructor
public class IteratorToEnumeration<E> implements Enumeration<E> {
    private final Iterator<E> iterator;

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public E nextElement() {
        return iterator.next();
    }
}
