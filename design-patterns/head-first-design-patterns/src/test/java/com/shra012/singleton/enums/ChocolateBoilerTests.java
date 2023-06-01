package com.shra012.singleton.enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ChocolateBoilerTests {

    @Test
    void shouldReturnTheSameInstance(){
        ChocolateBoiler instance = ChocolateBoiler.INSTANCE;
        ChocolateBoiler instance2 = ChocolateBoiler.INSTANCE;
        Assertions.assertEquals(instance, instance2);
    }

    @Test
    void shouldRunAllFunctions(){
        ChocolateBoiler instance = ChocolateBoiler.INSTANCE;
        Assertions.assertTrue(instance.isEmpty());
        Assertions.assertFalse(instance.isBoiled());
        instance.fill();
        Assertions.assertFalse(instance.isEmpty());
        Assertions.assertFalse(instance.isBoiled());
        instance.boil();
        Assertions.assertFalse(instance.isEmpty());
        Assertions.assertTrue(instance.isBoiled());
        instance.drain();
        Assertions.assertTrue(instance.isEmpty());
    }
}
