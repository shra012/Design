package com.shra012.factory.pizzafm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PizzaStoreTests {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();
    private static final String PIZZA = "Pizza";

    @Test
    void shouldDeliverNyStyleCheesePizza() {
        Pizza pizza = nyStore.orderPizza("cheese");
        assertNYPizzaName("Cheese", pizza.getName());
    }

    @Test
    void shouldDeliverNyStyleClaimPizza() {
        Pizza pizza = nyStore.orderPizza("clam");
        assertNYPizzaName("Clam", pizza.getName());
    }

    @Test
    void shouldDeliverNyStylePepperoniPizza() {
        Pizza pizza = nyStore.orderPizza("pepperoni");
        assertNYPizzaName("Pepperoni", pizza.getName());
    }

    @Test
    void shouldDeliverNyStyleVeggiePizza() {
        Pizza pizza = nyStore.orderPizza("veggie");
        assertNYPizzaName("Veggie", pizza.getName());
    }

    @Test
    void shouldDeliverChicagoStyleCheesePizza() {
        Pizza pizza = chicagoStore.orderPizza("cheese");
        assertChicagoPizzaName("Deep Dish Cheese", pizza.getName());
    }

    @Test
    void shouldDeliverChicagoStyleClaimPizza() {
        Pizza pizza = chicagoStore.orderPizza("clam");
        assertChicagoPizzaName("Clam", pizza.getName());
    }

    @Test
    void shouldDeliverChicagoStylePepperoniPizza() {
        Pizza pizza = chicagoStore.orderPizza("pepperoni");
        assertChicagoPizzaName("Pepperoni", pizza.getName());
    }

    @Test
    void shouldDeliverChicagoStyleVeggiePizza() {
        Pizza pizza = chicagoStore.orderPizza("veggie");
        assertChicagoPizzaName("Deep Dish Veggie", pizza.getName());
    }

    private void assertNYPizzaName(String type, String actualName) {
        Assertions.assertEquals("NY Style " + type + " " + PIZZA, actualName);
    }

    private void assertChicagoPizzaName(String type, String actualName) {
        Assertions.assertEquals("Chicago Style " + type + " " + PIZZA, actualName);
    }
}
