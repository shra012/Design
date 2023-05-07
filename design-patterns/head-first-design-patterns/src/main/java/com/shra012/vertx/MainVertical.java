package com.shra012.vertx;

import com.shra012.observer.weather.CurrentConditionsDisplay;
import com.shra012.observer.weather.ForecastDisplay;
import com.shra012.observer.weather.WeatherData;
import com.shra012.vertx.routes.CurrentConditionsDisplayRoute;

import com.shra012.vertx.routes.ForecastDisplayRoute;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainVertical extends AbstractVerticle {

    @Override
    public void start(Promise<Void> startPromise) {
        HttpServer httpServer = vertx.createHttpServer();
        Router mainRouter = Router.router(vertx);
        WeatherData weatherData = WeatherData.builder().build();
        Router weatherRouter =
                CurrentConditionsDisplayRoute.builder()
                        .withCurrentConditionsDisplay(
                                CurrentConditionsDisplay.builder()
                                        .withWeatherData(weatherData)
                                        .build())
                        .withVertx(vertx)
                        .build()
                        .initializeRoutes();
        Router forecastRouter = ForecastDisplayRoute.builder().withForecastDisplay(new ForecastDisplay(weatherData)).build().initializeRoutes();
        mainRouter.route("/weather/*")
                .subRouter(weatherRouter);
        mainRouter.route("/forecast/*").subRouter(forecastRouter);
        mainRouter.route(HttpMethod.GET, "/").handler(
                ctx ->
                        ctx.response()
                                .putHeader("content-type", "text/plain")
                                .end("Hello from Vert.x!"));
        httpServer.requestHandler(mainRouter);
        httpServer.listen(
                8080,
                http -> {
                    if (http.succeeded()) {
                        startPromise.complete();
                        log.info("HTTP server started on port 8080");
                    } else {
                        startPromise.fail(http.cause());
                    }
                });
    }
}
