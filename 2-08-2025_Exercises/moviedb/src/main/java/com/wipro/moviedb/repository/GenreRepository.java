package com.wipro.moviedb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.moviedb.entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
