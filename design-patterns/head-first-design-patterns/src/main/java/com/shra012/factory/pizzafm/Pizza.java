package com.shra012.factory.pizzafm;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
@RequiredArgsConstructor
abstract class Pizza {
    protected final String name;
    protected final String dough;
    protected final String sauce;
    protected final List<String> toppings = new ArrayList<>();

    void prepare() {
        log.info("Preparing {}", name);
    }

    void bake() {
        log.info("Baking {}", name);
    }

    void cut() {
        log.info("Cutting {}", name);
    }

    void box() {
        log.info("Boxing {}", name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuilder display = new StringBuilder();
        display.append("----")
                .append(name)
                .append("----\n")
                .append(dough)
                .append("\n")
                .append(sauce)
                .append("\n");
        for (String topping : toppings) {
            display.append(topping).append("\n");
        }
        return display.toString();
    }
}
