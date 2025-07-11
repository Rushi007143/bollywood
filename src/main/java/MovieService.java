package com.example.moviesms.service;

import com.example.moviesms.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    public List<Movie> getAllMovies() {
        return List.of(
                new Movie(1L, "3 Idiots", "Drama", 2009, "https://image.tmdb.org/t/p/w500/xyz1.jpg"),
                new Movie(2L, "Sholay", "Action", 1975, "https://image.tmdb.org/t/p/w500/xyz2.jpg"),
                new Movie(3L, "DDLJ", "Romance", 1995, "https://image.tmdb.org/t/p/w500/xyz3.jpg")
        );
    }
}
