package com.shra012.factory.pizzas;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

@Slf4j
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PizzaStoreTests {
    SimplePizzaFactory factory;
    PizzaStore store;

    @BeforeAll
    void setup() {
        factory = new SimplePizzaFactory();
        store = new PizzaStore(factory);
    }

    @Test
    void shouldDeliverCheesePizza() {
        Pizza pizza = store.orderPizza("cheese");
        Assertions.assertEquals("Cheese Pizza", pizza.getName());
    }

    @Test
    void shouldDeliverClaimPizza() {
        Pizza pizza = store.orderPizza("clam");
        Assertions.assertEquals("Clam Pizza", pizza.getName());
    }

    @Test
    void shouldDeliverPepperoniPizza() {
        Pizza pizza = store.orderPizza("pepperoni");
        Assertions.assertEquals("Pepperoni Pizza", pizza.getName());
    }

    @Test
    void shouldDeliverVeggiePizza() {
        Pizza pizza = store.orderPizza("veggie");
        Assertions.assertEquals("Veggie Pizza", pizza.getName());
    }

}
