package com.shra012.factory.pizzafm;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        super("NY Style Pepperoni Pizza", "Thin Crust Dough", "Marinara Sauce");
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}