package com.example.bollywood_ms.service;

import com.example.bollywood_ms.model.Movie;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {

    public List<Movie> getAllMovies() {
        return Arrays.asList(
                new Movie(1L, "DDLJ", "Romance", 1995),
                new Movie(2L, "Sholay", "Action", 1975),
                new Movie(3L, "3 Idiots", "Drama", 2009)
        );
    }
}
