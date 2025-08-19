import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ex8home } from './ex8home/ex8home';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('fourthapp');
}
