package com.shra012.templatemethod.barista;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Coffee extends CaffeineBeverage {

    private final boolean customerWantsMilk;

    @Override
    public String brew() {
        return "Dripping Coffee through filter";
    }

    @Override
    public String addCondiments() {
        return "Adding Sugar and Milk";
    }

    @Override
    boolean customerWantsCondiments() {
        return customerWantsMilk;
    }
}
