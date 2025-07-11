package com.example.bollywood_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BollywoodApplication {
    public static void main(String[] args) {
        SpringApplication.run(BollywoodApplication.class, args);
        System.out.println("🎬 Bollywood Movie Service is running...");
    }
}
