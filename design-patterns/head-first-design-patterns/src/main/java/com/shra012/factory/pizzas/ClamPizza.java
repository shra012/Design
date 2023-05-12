package com.shra012.factory.pizzas;

import java.util.ArrayList;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        super("Clam Pizza", "Thin crust", "White garlic sauce", new ArrayList<>());
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}