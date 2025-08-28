import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ex2Vehiclecomp } from './ex2-vehiclecomp/ex2-vehiclecomp';

@Component({
  selector: 'app-root',
  standalone: true,                        
  imports: [Ex2Vehiclecomp], 
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('fifthapp');
}
