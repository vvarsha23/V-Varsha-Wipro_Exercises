import { Injectable } from '@angular/core';
import { Movie } from './movie';

@Injectable({
  providedIn: 'root'
})
export class Movieservice {
  private movies: Movie[] = [];

  getMovies(): Movie[] {
    return [...this.movies];
  }

  addMovie(movie: Movie): void {
    this.movies.push(movie);
  }

  updateMovie(movieId: number, updatedMovie: Movie): void {
    const index = this.movies.findIndex(m => m.movieId === movieId);
    if (index !== -1) {
      this.movies[index] = updatedMovie;
    }
  }

  deleteMovie(movieId: number): void {
    this.movies = this.movies.filter(m => m.movieId !== movieId);
  }

  getMovieById(movieId: number): Movie | undefined {
    return this.movies.find(m => m.movieId === movieId);
  }
  
}
