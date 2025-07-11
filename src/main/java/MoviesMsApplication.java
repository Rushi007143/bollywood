package com.example.moviesms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesMsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoviesMsApplication.class, args);
        System.out.println("🎬 Movie Service running on http://localhost:8081/movies");
    }
}
