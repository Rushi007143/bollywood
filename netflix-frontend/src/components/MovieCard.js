import React from 'react';
import './MovieCard.css';

const MovieCard = ({ movie }) => {
  return (
    <div className="movie-card">
      <img src={movie.imageUrl} alt={movie.title} />
      <h3>{movie.title}</h3>
      <p>{movie.genre} | {movie.year}</p>
    </div>
  );
};

export default MovieCard;
