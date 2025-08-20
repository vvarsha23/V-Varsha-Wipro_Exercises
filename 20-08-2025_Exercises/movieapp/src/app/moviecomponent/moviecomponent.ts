import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Movieservice } from '../movieservice';
import { Movie } from '../movie';

@Component({
  selector: 'app-moviecomponent',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './moviecomponent.html',
  styleUrl: './moviecomponent.css'
})
export class Moviecomponent {
  movie: Movie = { movieId: 0, movieName: '', language: '', imdbRating: 0 };
  movies: Movie[] = [];
  isEditMode = false;

  constructor(private movieService: Movieservice) {
    this.loadMovies();
  }

  loadMovies(): void {
    this.movies = this.movieService.getMovies();
  }

  saveMovie(): void {
    if (this.isEditMode) {
      this.movieService.updateMovie(this.movie.movieId, this.movie);
      this.isEditMode = false;
    } else {
      this.movieService.addMovie({ ...this.movie });
    }
    this.resetForm();
    this.loadMovies();
  }

  editMovie(m: Movie): void {
    this.movie = { ...m };
    this.isEditMode = true;
  }

  deleteMovie(id: number): void {
    this.movieService.deleteMovie(id);
    this.loadMovies();
  }

  resetForm(): void {
    this.movie = { movieId: 0, movieName: '', language: '', imdbRating: 0 };
    this.isEditMode = false;
  }

}
