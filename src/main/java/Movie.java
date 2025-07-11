package com.example.moviesms.model;

public class Movie {
    private Long id;
    private String title;
    private String genre;
    private int year;
    private String imageUrl;

    public Movie() {}

    public Movie(Long id, String title, String genre, int year, String imageUrl) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.imageUrl = imageUrl;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getYear() { return year; }
    public String getImageUrl() { return imageUrl; }

    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setYear(int year) { this.year = year; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
