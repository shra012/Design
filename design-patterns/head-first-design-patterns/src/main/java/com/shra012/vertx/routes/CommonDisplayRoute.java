package com.shra012.vertx.routes;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder(setterPrefix = "with")
@RequiredArgsConstructor
public class CommonDisplayRoute {
    private final Vertx vertx;
    public Router initializeRoutes(){
        return Router.router(vertx);
    }
}
