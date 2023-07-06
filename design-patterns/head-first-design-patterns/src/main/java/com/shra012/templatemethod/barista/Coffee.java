package com.shra012.templatemethod.barista;

public class Coffee implements CaffeineBeverage {
    @Override
    public String brew() {
        return "Dripping Coffee through filter";
    }

    @Override
    public String addCondiments() {
        return "Adding Sugar and Milk";
    }
}
