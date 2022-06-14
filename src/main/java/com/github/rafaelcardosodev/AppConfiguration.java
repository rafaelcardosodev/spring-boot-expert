package com.github.rafaelcardosodev;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class AppConfiguration {
    @Bean
    public CommandLineRunner execute() {
        return args -> {
            System.out.println("Executing development configuration");
        };
    }
}
