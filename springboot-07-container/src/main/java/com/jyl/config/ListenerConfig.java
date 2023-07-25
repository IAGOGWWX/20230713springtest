package com.jyl.config;

import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class ListenerConfig {

    @EventListener(WebServerInitializedEvent.class)
    public void printWebServerName(WebServerInitializedEvent event){
        //WebConfig---当前web容器的实现类是：
        // org.springframework.boot.web.embedded.undertow.UndertowServletWebServer
        System.out.println("WebServerInitializedEvent---当前webserver的实现类为："
                + event.getWebServer().getClass().getName());
    }

}
