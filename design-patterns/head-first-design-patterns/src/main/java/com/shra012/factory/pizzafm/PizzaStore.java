package com.shra012.factory.pizzafm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface PizzaStore {
    Logger log = LoggerFactory.getLogger(PizzaStore.class);

    Pizza createPizza(String item);

    default Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        log.info("--- Making a {} ---", pizza.getName());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}