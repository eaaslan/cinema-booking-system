package com.eaaslan.cinema_booking_system.service;

import com.eaaslan.cinema_booking_system.model.Movie;
import com.eaaslan.cinema_booking_system.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

@Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }
    public Movie deleteMovie(Long id) {
        Movie movie = movieRepository.findById(id).orElse(null);
        if (movie != null) {
            movieRepository.deleteById(id);
        }
        return movie;
    }

}
