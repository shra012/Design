package com.shra012.observer.weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CurrentConditionsDisplayTests {
    @Test
    void testCurrentConditions() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.2f);
        CurrentConditions currentConditions = currentDisplay.display();
        Assertions.assertEquals(80, currentConditions.temperature());
        Assertions.assertEquals(65, currentConditions.humidity());
        weatherData.setMeasurements(82, 70, 30.2f);
        currentConditions = currentDisplay.display();
        Assertions.assertEquals(82, currentConditions.temperature());
        Assertions.assertEquals(70, currentConditions.humidity());
        weatherData.setMeasurements(78, 90, 30.2f);
        currentConditions = currentDisplay.display();
        Assertions.assertEquals(78, currentConditions.temperature());
        Assertions.assertEquals(90, currentConditions.humidity());
    }
}
