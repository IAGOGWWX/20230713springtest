package com.jyl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan(basePackages = "com.jyl.filter")
public class ServletSpringBootApplication {


    public static void main(String[] args) {
        SpringApplication.run(ServletSpringBootApplication.class);
    }
}
