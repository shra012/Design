package com.shra012.factory.pizzafm;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        super("NY Style Clam Pizza", "Thin Crust Dough", "Marinara Sauce");
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}
