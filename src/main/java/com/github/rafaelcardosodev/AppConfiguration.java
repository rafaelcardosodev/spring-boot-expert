package com.github.rafaelcardosodev;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class AppConfiguration {
    @Bean
    public CommandLineRunner execute() {
        return args -> {
            System.out.println("Executing development configuration");
        };
    }
}
