package com.shra012.factory.pizzafm;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        super("NY Style Veggie Pizza", "Thin Crust Dough", "Marinara Sauce");
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}