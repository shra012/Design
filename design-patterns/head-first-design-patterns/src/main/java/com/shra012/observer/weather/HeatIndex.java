package com.shra012.observer.weather;

import lombok.Builder;

@Builder(setterPrefix = "with")
public record HeatIndex(float heatIndex) implements DisplayRecord {}
