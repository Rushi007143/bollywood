import axios from 'axios';

const API_URL = 'http://localhost:8081/movies'; // Update if your backend is on a different port

export const getMovies = async () => {
  try {
    const response = await axios.get(API_URL);
    return response.data;
  } catch (error) {
    console.error("Error fetching movies:", error);
    return [];
  }
};
