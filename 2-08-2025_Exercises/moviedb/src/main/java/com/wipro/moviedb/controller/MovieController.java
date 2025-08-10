package com.wipro.moviedb.controller;
import com.wipro.moviedb.entity.Movie;
import com.wipro.moviedb.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
	@Autowired
    private MovieRepository movieRepo;

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return movieRepo.save(movie);
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieRepo.findAll();
    }

    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable Long id) {
        return movieRepo.findById(id).orElse(null);
    }
	

}
