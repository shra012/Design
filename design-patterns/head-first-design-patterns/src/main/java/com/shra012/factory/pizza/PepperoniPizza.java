package com.shra012.factory.pizza;

import java.util.ArrayList;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        super("Pepperoni Pizza", "Crust", "Marinara sauce", new ArrayList<>());
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
