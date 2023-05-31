package com.shra012.factory.pizzafm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        super("Chicago Style Pepperoni Pizza", "Extra Thick Crust Dough", "Plum Tomato Sauce");
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
        toppings.add("Sliced Pepperoni");
    }

    @Override
    void cut() {
        log.info("Cutting the pizza into square slices");
    }
}
