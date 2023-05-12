package com.shra012.factory.pizzas;

import java.util.ArrayList;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        super("Veggie Pizza", "Crust", "Marinara sauce", new ArrayList<>());
        toppings.add("Shredded mozzarella");
        toppings.add("Grated parmesan");
        toppings.add("Diced onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black olives");
    }
}