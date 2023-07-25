package com.jyl;


import com.jyl.configuration.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({UserConfig.class})
public class DemoApplication {

    public static void main(String[] args) {

         SpringApplication.run(DemoApplication.class);
    }
}
