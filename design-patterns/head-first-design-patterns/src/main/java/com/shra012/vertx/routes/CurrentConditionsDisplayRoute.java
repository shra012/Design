package com.shra012.vertx.routes;

import com.shra012.observer.weather.CurrentConditionsDisplay;

import io.vertx.core.Future;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.Router;

import lombok.experimental.SuperBuilder;

import java.util.Random;

@SuperBuilder(setterPrefix = "with")
public class CurrentConditionsDisplayRoute extends CommonDisplayRoute {
    private final CurrentConditionsDisplay currentConditionsDisplay;
    private final Random random = new Random();
    @Override
    public Router initializeRoutes() {
        Router router = super.initializeRoutes();
        router.route(HttpMethod.GET, "/currentConditions")
                .respond(ctx -> Future.succeededFuture(currentConditionsDisplay.display()));
        router.route(HttpMethod.GET, "/updateConditions")
                .respond(ctx -> {
                    currentConditionsDisplay.getWeatherData().setMeasurements(random.nextFloat(65, 100),random.nextFloat(80, 100),random.nextFloat(70, 80));
                    return Future.succeededFuture(currentConditionsDisplay.display());
                });
        return router;
    }
}
