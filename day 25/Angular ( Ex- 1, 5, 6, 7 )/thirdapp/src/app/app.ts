import { Component, signal } from '@angular/core';
// import { RouterOutlet } from '@angular/router';
//import { Homecomp } from './homecomp/homecomp';


@Component({
  selector: 'app-root',
  standalone: true,          
  imports: [  ],
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class App {
  protected readonly title = signal('thirdapp');
}
