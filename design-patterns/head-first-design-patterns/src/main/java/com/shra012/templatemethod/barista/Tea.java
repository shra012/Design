package com.shra012.templatemethod.barista;

public class Tea implements CaffeineBeverage {
    @Override
    public String brew() {
        return "Steeping the tea";
    }

    @Override
    public String addCondiments() {
        return "Adding Lemon";
    }
}