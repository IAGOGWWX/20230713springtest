package com.jyl.config;


import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;


@Configuration
public class WebConfig {
    @Bean
    public ApplicationRunner runner(WebServerApplicationContext context){
        return args -> {
            //WebConfig---当前web容器的实现类是：
            // org.springframework.boot.web.embedded.undertow.UndertowServletWebServer
            System.out.println("WebConfig---当前web容器的实现类是：" +
                    context.getWebServer().getClass().getName());
        };

    }
}
