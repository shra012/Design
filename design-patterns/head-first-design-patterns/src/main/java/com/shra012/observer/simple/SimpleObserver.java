package com.shra012.observer.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleObserver implements Observer {
    private int value;

    public SimpleObserver(Subject simpleSubject) {
        simpleSubject.registerObserver(this);
    }

    public void update(int value) {
        this.value = value;
        display();
    }

    public int display() {
        log.info("Value: {}", value);
        return value;
    }
}
