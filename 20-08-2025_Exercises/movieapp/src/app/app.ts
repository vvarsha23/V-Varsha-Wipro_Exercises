import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Movieservice } from './movieservice';
import { Moviecomponent } from './moviecomponent/moviecomponent';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,Moviecomponent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('movieapp');
}
