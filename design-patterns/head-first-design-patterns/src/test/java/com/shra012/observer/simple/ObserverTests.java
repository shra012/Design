package com.shra012.observer.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ObserverTests {
    @Test
    void observeTests() {
        SimpleSubject simpleSubject = new SimpleSubject();
        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
        simpleSubject.setValue(80);
        Assertions.assertEquals(80, simpleObserver.display());
        simpleSubject.removeObserver(simpleObserver);
    }
}
