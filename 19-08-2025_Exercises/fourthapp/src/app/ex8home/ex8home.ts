import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Itask } from '../itask';
import { Task } from '../task/task';
import { Tasklist } from '../tasklist/tasklist';

@Component({
  selector: 'app-ex8home',
  standalone: true,
  imports: [CommonModule,Task,Tasklist],
  templateUrl: './ex8home.html',
  styleUrl: './ex8home.css'
})
export class Ex8home {
  tasks: Itask[] = [];
  taskidCounter = 1;
  addTask(task:Omit<Itask, 'id'>) {
    const newTask: Itask = {
      id: this.taskidCounter++,
      ...task
    };
    this.tasks.push(newTask);
  }
  deleteTask(id: number) {
    this.tasks = this.tasks.filter(task => task.id !== id);
  }

}