package com.knoldus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.knoldus")
public class SimpleAnnotationOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleAnnotationOneApplication.class, args);
    }

}
