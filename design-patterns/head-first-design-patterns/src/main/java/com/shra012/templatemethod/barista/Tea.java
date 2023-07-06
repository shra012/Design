package com.shra012.templatemethod.barista;

public class Tea extends CaffeineBeverage {
    @Override
    public String brew() {
        return "Steeping the tea";
    }

    @Override
    public String addCondiments() {
        return "Adding Lemon";
    }
}