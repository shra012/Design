package com.shra012.templatemethod.barista;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Tea extends CaffeineBeverage {
    private final boolean customerWantsLemon;
    @Override
    public String brew() {
        return "Steeping the tea";
    }

    @Override
    public String addCondiments() {
        return "Adding Lemon";
    }

    @Override
    boolean customerWantsCondiments() {
        return customerWantsLemon;
    }


}