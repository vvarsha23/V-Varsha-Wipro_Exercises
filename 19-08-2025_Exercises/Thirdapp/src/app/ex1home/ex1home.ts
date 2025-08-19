import { Component } from '@angular/core';
import { Ex1Displaylist } from '../ex1-displaylist/ex1-displaylist';
import { NgClass } from '@angular/common';
import { Iex1Displaylist } from '../iex1-displaylist';

@Component({
  selector: 'app-ex1home',
  standalone: true,
  imports: [Ex1Displaylist,NgClass],
  templateUrl: './ex1home.html',
  styleUrl: './ex1home.css'
})
export class Ex1home {
  fruits: Iex1Displaylist[] = [
    { name: 'Apple', color: 'red' },
    { name: 'Banana', color: 'yellow' },
    { name: 'Cherry', color: 'red' },
    { name: 'Mango', color: 'orange' }
  ];
  removeFruit(fruitToRemove: Iex1Displaylist) {
    this.fruits = this.fruits.filter(fruit => fruit !== fruitToRemove);
  }

}