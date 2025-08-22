import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Productcomp } from './productcomp/productcomp';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,Productcomp],
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class App {
  protected readonly title = signal('productapp');
}
