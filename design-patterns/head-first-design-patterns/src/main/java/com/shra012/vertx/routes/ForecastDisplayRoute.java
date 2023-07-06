package com.shra012.vertx.routes;

import com.shra012.observer.weather.ForecastDisplay;
import io.vertx.core.Future;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.Router;
import lombok.experimental.SuperBuilder;

import java.util.Random;

@SuperBuilder(setterPrefix = "with")
public class ForecastDisplayRoute extends CommonDisplayRoute {
    private final ForecastDisplay forecastDisplay;
    private final Random random = new Random();
    @Override
    public Router initializeRoutes() {
        Router router = super.initializeRoutes();
        router.route(HttpMethod.GET, "/")
                .respond(ctx -> Future.succeededFuture(forecastDisplay.display()));
        router.route(HttpMethod.GET, "/updateForecast")
                .respond(ctx -> {
                    forecastDisplay.getWeatherData().setMeasurements(random.nextFloat(65, 100),random.nextFloat(80, 100),random.nextFloat(70, 80));
                    return Future.succeededFuture(forecastDisplay.display());
                });
        return router;
    }
}
