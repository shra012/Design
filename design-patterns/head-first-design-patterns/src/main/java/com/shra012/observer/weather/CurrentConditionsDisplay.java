package com.shra012.observer.weather;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Builder(setterPrefix = "with")
@AllArgsConstructor
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public CurrentConditions display() {
        log.info("Current conditions {} F degrees and {} humidity", temperature, humidity);
        return CurrentConditions.builder()
                .withHumidity(humidity)
                .withTemperature(temperature)
                .build();
    }
}
