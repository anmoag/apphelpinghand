package com.inserta.apphelpinghand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.inserta.apphelpinghand.config")
public class ApphelpinghandApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApphelpinghandApplication.class, args);
    }

}
