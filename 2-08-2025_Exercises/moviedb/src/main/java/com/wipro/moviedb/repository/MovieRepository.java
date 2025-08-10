package com.wipro.moviedb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.moviedb.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
