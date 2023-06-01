package com.shra012.singleton.threadsafe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTests {

    @Test
   void shouldHaveTheSameInstance(){
       Singleton instance = Singleton.getInstance();
       Singleton instance1 = Singleton.getInstance();
       Assertions.assertEquals(instance, instance1);
       Assertions.assertEquals(instance.getDescription(), instance1.getDescription());
   }
}
