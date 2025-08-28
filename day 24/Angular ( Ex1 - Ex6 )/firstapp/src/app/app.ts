import { Component, signal } from '@angular/core';
import { Secondcomp } from './secondcomp/secondcomp';
import { bootstrapApplication } from '@angular/platform-browser';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [Secondcomp],
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class App {
  protected readonly title = signal('firstapp');
}
