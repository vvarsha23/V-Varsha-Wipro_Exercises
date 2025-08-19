import { CommonModule, NgClass } from '@angular/common';
import { Component,Output,EventEmitter } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Itask } from '../itask';
@Component({
  selector: 'app-task',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './task.html',
  styleUrl: './task.css'
})
export class Task {
  description: string = '';
  category: string = '';
  @Output() add = new EventEmitter<Omit<Itask, 'id'>>();
  categories: string[] = ['Work', 'Personal', 'Urgent'];
  addTask() {
    if (this.description && this.category) {
      this.add.emit({ description: this.description, category: this.category });
      this.description = '';
      this.category = '';
    }
  }

}