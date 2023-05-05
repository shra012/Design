package com.shra012.observer.weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HeatIndexDisplayTests {

    @Test
    void testHeatIndex() {
        WeatherData weatherData = new WeatherData();
        HeatIndexDisplay heatDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.2f);
        HeatIndex heatIndex = heatDisplay.display();
        Assertions.assertEquals(82.96f, heatIndex.heatIndex());
        weatherData.setMeasurements(82, 70, 30.2f);
        heatIndex = heatDisplay.display();
        Assertions.assertEquals(86.9f, heatIndex.heatIndex());
        weatherData.setMeasurements(78, 90, 30.2f);
        heatIndex = heatDisplay.display();
        Assertions.assertEquals(83.65f, heatIndex.heatIndex());
    }
}
