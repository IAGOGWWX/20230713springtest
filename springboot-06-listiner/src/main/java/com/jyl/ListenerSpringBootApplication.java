package com.jyl;

import com.jyl.listener.CustomListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ListenerSpringBootApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ListenerSpringBootApplication.class);
        applicationContext.addApplicationListener(new CustomListener1());

    }
}
