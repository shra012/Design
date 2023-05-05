package com.shra012.vertx.routes;

import com.shra012.observer.weather.CurrentConditionsDisplay;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.Router;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder(setterPrefix = "with")
@RequiredArgsConstructor
public class CurrentConditionsRoute {
    private final Vertx vertx;
    private final CurrentConditionsDisplay currentConditionsDisplay;

    public Router initializeRoutes() {
        Router router = Router.router(vertx);
        router.route(HttpMethod.GET, "/currentConditions")
                .respond(ctx -> Future.succeededFuture(currentConditionsDisplay.display()));
        return router;
    }
}
