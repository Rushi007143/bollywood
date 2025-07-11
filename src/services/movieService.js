import axios from 'axios';

export const getMovies = async () => {
  try {
    const response = await axios.get('http://localhost:8081/movies');
    return response.data;
  } catch (error) {
    console.error('Failed to fetch movies:', error);
    return [];
  }
};
