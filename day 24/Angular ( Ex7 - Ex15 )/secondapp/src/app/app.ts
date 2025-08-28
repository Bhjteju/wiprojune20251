import { Component, signal } from '@angular/core';
// import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Checkboxcomp } from './checkboxcomp/checkboxcomp';
import { Ex15Homecomp } from './ex15-homecomp/ex15-homecomp';

@Component({
  selector: 'app-root',
  imports: [FormsModule, CommonModule, Checkboxcomp, Ex15Homecomp ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('secondapp');

  name:String='Srikanth';

  greet() {
    alert(`Hello ${this.name}`);
    console.log(`${this.name} Says! Hello`);
  }
}
