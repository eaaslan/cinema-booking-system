package com.eaaslan.cinema_booking_system.controller;

import com.eaaslan.cinema_booking_system.model.Movie;
import com.eaaslan.cinema_booking_system.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/movie")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // TODO: Implement the endpoints for the MovieController

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies() {
        return ResponseEntity.ok(movieService.getMovies());
    }

    @GetMapping("/id")
    public ResponseEntity< Movie> getMovieById(Long id) {
        return  ResponseEntity.ok(movieService.getMovieById(id));
    }

    @GetMapping("/add")
    public ResponseEntity<Movie> addMovie(Movie movie) {
        return ResponseEntity.ok(movieService.addMovie(movie));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Movie> deleteMovie(Long id) {
        return ResponseEntity.ok(movieService.deleteMovie(id));
    }
}
