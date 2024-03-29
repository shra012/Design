package com.shra012.observer.weather;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private final WeatherData weatherData;

    @Builder(setterPrefix = "with")
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
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
