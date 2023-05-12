package com.shra012.decorator.starbuzz;

import com.shra012.decorator.starbuzz.Beverage.Size;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StarbuzzTests {

    @Test
    void testEspressoMilk() {
        Beverage espresso = new Espresso();
        Beverage milkEspresso = new Milk(espresso);

        Assertions.assertEquals(2.09, (double) Math.round(milkEspresso.cost() * 100) / 100);
        Assertions.assertEquals("Espresso, Milk", milkEspresso.getDescription());
    }
    @Test
    void testMochaDecaf() {
        Beverage decaf = new Decaf();
        Beverage beverage = new Mocha(decaf);

        Assertions.assertEquals(1.25, (double) Math.round(beverage.cost() * 100) / 100);
        Assertions.assertEquals("Decaf Coffee, Mocha", beverage.getDescription());
    }

    @Test
    void testMochaMilkBlend() {
        Beverage blend = new HouseBlend();
        Beverage  milkBlend = new Milk(blend);
        Beverage mochaMilkBlend = new Mocha(milkBlend);

        Assertions.assertEquals(1.19, (double) Math.round(mochaMilkBlend.cost() * 100) / 100);
        Assertions.assertEquals("House Blend Coffee, Milk, Mocha", mochaMilkBlend.getDescription());
    }

    @Test
    void testDoubleMochaLatteWithWhip() {
        Beverage houseBlend = new HouseBlend();
        Beverage mochaLatte = new Mocha(houseBlend);
        Beverage doubleMochaLatte = new Mocha(mochaLatte);
        Beverage doubleMochaLatteWithWhip = new Whip(doubleMochaLatte);

        Assertions.assertEquals(1.39, (double) Math.round(doubleMochaLatteWithWhip.cost() * 100) / 100);
        Assertions.assertEquals("House Blend Coffee, Mocha, Mocha, Whip", doubleMochaLatteWithWhip.getDescription());
    }

    @Test
    void testSoyMochaDarkRoastWithWhipInDifferentSizes() {
        Beverage darkRoast = new DarkRoast();
        darkRoast.setSize(Size.TALL);
        Beverage soyDarkRoast = new Soy(darkRoast);
        Beverage soyMochaDarkRoast = new Mocha(soyDarkRoast);
        Beverage soyMochaDarkRoastWithWhip = new Whip(soyMochaDarkRoast);

        Assertions.assertEquals(1.39, (double) Math.round(soyMochaDarkRoastWithWhip.cost() * 100) / 100);
        darkRoast.setSize(Size.GRANDE);
        Assertions.assertEquals(1.44, (double) Math.round(soyMochaDarkRoastWithWhip.cost() * 100) / 100);
        darkRoast.setSize(Size.VENTI);
        Assertions.assertEquals(1.49, (double) Math.round(soyMochaDarkRoastWithWhip.cost() * 100) / 100);
    }
}
