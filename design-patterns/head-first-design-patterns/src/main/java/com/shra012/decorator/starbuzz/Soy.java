package com.shra012.decorator.starbuzz;

public class Soy extends Condiment {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.VENTI) {
            cost += 0.2;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.15;
        } else {
            cost += 0.1;
        }
        return cost;
    }
}
