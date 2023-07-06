package com.shra012.templatemethod.barista;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BaristaTests {

    @Test
    void shouldBrewCoffee(){
        Coffee coffee = spy(new Coffee(true));
        coffee.prepareRecipe();
        verify(coffee, times(1)).boilWater();
        verify(coffee, times(1)).brew();
        verify(coffee, times(1)).pourInCup();
        verify(coffee, times(1)).addCondiments();
        Assertions.assertEquals("Boiling water", coffee.boilWater());
        Assertions.assertEquals("Dripping Coffee through filter", coffee.brew());
        Assertions.assertEquals("Pouring into cup", coffee.pourInCup());
        Assertions.assertEquals("Adding Sugar and Milk", coffee.addCondiments());
    }

    @Test
    void shouldSteepTea(){
        Tea tea = spy(new Tea(true));
        tea.prepareRecipe();
        verify(tea, times(1)).boilWater();
        verify(tea, times(1)).brew();
        verify(tea, times(1)).pourInCup();
        verify(tea, times(1)).addCondiments();
        Assertions.assertEquals("Boiling water", tea.boilWater());
        Assertions.assertEquals("Steeping the tea", tea.brew());
        Assertions.assertEquals("Pouring into cup", tea.pourInCup());
        Assertions.assertEquals("Adding Lemon", tea.addCondiments());
    }

    @Test
    void shouldSteepBlackTea(){
        Tea tea = spy(new Tea(false));
        tea.prepareRecipe();
        verify(tea, times(1)).boilWater();
        verify(tea, times(1)).brew();
        verify(tea, times(1)).pourInCup();
        verify(tea, times(0)).addCondiments();
        Assertions.assertEquals("Boiling water", tea.boilWater());
        Assertions.assertEquals("Steeping the tea", tea.brew());
        Assertions.assertEquals("Pouring into cup", tea.pourInCup());
    }
}
