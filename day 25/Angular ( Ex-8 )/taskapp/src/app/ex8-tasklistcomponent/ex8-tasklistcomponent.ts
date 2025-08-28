import { Component, Input, Output, EventEmitter } from '@angular/core';
import { Task } from '../task';
import { NgFor } from '@angular/common';

@Component({
  selector: 'app-ex8-tasklistcomponent',
  imports: [NgFor],
  templateUrl: './ex8-tasklistcomponent.html',
  styleUrl: './ex8-tasklistcomponent.css'
})
export class Ex8tasklistcomponent {

  @Input() tasks: Task[] = [];
  @Output() deleteTask = new EventEmitter<number>();

  onDelete(index: number) {
    this.deleteTask.emit(index);
  }
}
