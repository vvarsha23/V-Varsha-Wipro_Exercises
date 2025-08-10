package com.wipro.moviedb.entity;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Genre {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "genres")
    private Set<Movie> movies;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

	@Override
	public String toString() {
		return "Genre [id=" + id + ", description=" + description + "]";
	}

}
