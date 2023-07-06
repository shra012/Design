package com.shra012.templatemethod.barista;

public interface CaffeineBeverage {

    default void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract String brew();

    abstract String addCondiments();

    default String boilWater() {
        return "Boiling water";
    }

    default String pourInCup() {
        return "Pouring into cup";
    }
}
