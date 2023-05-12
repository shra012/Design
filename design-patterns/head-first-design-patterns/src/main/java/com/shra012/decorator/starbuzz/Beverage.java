package com.shra012.decorator.starbuzz;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI}
    @Setter
    Size size = Size.TALL;
    protected String description = "Beverage";
    public abstract double cost();
}
