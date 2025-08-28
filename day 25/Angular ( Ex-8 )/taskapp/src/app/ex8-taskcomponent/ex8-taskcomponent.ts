import { Component, Output, EventEmitter } from '@angular/core';
import { Task } from '../task';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex8-taskcomponent',
  imports: [FormsModule],
  templateUrl: './ex8-taskcomponent.html',
  styleUrl: './ex8-taskcomponent.css'
})
export class Ex8taskcomponent {
description = '';
  category = '';

  @Output() taskAdded = new EventEmitter<Task>();

  addTask() {
    if (!this.description || !this.category) return;

    const task: Task = {
      description: this.description,
      category: this.category
    };

    this.taskAdded.emit(task);

    this.description = '';
    this.category = '';
  }
}
