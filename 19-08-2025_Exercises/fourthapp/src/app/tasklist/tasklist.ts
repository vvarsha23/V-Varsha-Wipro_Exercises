import { Component,Input,Output,EventEmitter } from '@angular/core';
import { Itask } from '../itask';
import { CommonModule, NgClass } from '@angular/common';

@Component({
  selector: 'app-tasklist',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './tasklist.html',
  styleUrl: './tasklist.css'
})
export class Tasklist {
  @Input() tasks: Itask[] = [];
  @Output() delete = new EventEmitter<number>();
  deleteTask(id: number) {
    this.delete.emit(id);
  }

} 