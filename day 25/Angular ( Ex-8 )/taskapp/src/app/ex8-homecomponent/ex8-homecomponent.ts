import { Component } from '@angular/core';
import { Ex8taskcomponent } from '../ex8-taskcomponent/ex8-taskcomponent';
import { Ex8tasklistcomponent } from '../ex8-tasklistcomponent/ex8-tasklistcomponent';
import { Task } from '../task';

@Component({
  selector: 'app-ex8-homecomponent',
  imports: [Ex8taskcomponent, Ex8tasklistcomponent],
  templateUrl: './ex8-homecomponent.html',
  styleUrl: './ex8-homecomponent.css'
})
export class Ex8Homecomponent {

  tasks: Task[] = [];

  onTaskAdded(task: Task) {
    this.tasks.push(task);
  }

  deleteTask(index: number) {
    this.tasks.splice(index, 1);
  }
}
