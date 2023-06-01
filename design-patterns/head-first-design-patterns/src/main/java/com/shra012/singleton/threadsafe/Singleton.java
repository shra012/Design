package com.shra012.singleton.threadsafe;

@SuppressWarnings("java:S6548")
public class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }

    public String getDescription() {
        return "some functionality";
    }

    private static class SingletonHolder {
        static final Singleton singleton = new Singleton();
    }
}
