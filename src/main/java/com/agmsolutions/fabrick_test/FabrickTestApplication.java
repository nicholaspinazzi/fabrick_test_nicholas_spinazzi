package com.agmsolutions.fabrick_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class FabrickTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(FabrickTestApplication.class, args);
    }

}
