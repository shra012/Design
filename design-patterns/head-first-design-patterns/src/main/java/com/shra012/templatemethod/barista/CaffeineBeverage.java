package com.shra012.templatemethod.barista;

@SuppressWarnings("java:S1610")
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract String brew();

    abstract String addCondiments();

    String boilWater() {
        return "Boiling water";
    }

    String pourInCup() {
        return "Pouring into cup";
    }
}
