package com.shra012.factory.pizzafm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        super("Chicago Style Clam Pizza", "Extra Thick Crust Dough", "Plum Tomato Sauce");
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    @Override
    void cut() {
        log.info("Cutting the pizza into square slices");
    }
}