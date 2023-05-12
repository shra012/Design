package com.shra012.decorator.starbuzz;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "Most Excellent Dark Roast";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
