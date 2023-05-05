package com.shra012.observer.weather;

import lombok.Builder;

@Builder(setterPrefix = "with")
public record CurrentConditions(float temperature, float humidity) implements DisplayRecord {}
