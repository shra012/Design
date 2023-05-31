package com.shra012.factory.pizzafm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        super("Chicago Style Deep Dish Cheese Pizza", "Extra Thick Crust Dough", "Plum Tomato Sauce");
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        log.info("Cutting the pizza into square slices");
    }
}
