package com.shra012.factory.pizzafm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        super("Chicago Style Deep Dish Veggie Pizza", "Extra Thick Crust Dough", "Plum Tomato Sauce");
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    @Override
    void cut() {
        log.info("Cutting the pizza into square slices");
    }
}
