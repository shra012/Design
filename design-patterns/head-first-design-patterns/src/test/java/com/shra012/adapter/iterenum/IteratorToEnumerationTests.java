package com.shra012.adapter.iterenum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

class IteratorToEnumerationTests {

    @Test
    void shouldEnumerateAIterator() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Water", "Treatment", "Plant"));
        Enumeration<String> enumeration = new IteratorToEnumeration<>(words.iterator());
        int numberOfWords = 0;
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement();
            numberOfWords++;
        }
        Assertions.assertEquals(3, numberOfWords);
    }
}
