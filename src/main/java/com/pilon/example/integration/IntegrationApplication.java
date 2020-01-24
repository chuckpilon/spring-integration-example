package com.pilon.example.integration;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/integration/integration.xml")
public class IntegrationApplication {
    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext ctx = new SpringApplication(IntegrationApplication.class).run();
        System.out.println("Press ENTER to terminate");
        System.in.read();
        ctx.close();
    }
}