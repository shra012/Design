package com.shra012.factory.pizza;

import java.util.ArrayList;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        super("Cheese Pizza", "Regular Crust", "Marinara Pizza Sauce", new ArrayList<>());
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
