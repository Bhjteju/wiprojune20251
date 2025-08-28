import { CommonModule, DatePipe, UpperCasePipe } from '@angular/common';
import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { Ex3CelsiusToFahrenheitPipe } from './ex3-celsius-to-fahrenheit-pipe';
import { Ex4Highlightstrikethru } from './ex4-highlightstrikethru';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FormsModule, UpperCasePipe, DatePipe, CommonModule, Ex3CelsiusToFahrenheitPipe, Ex4Highlightstrikethru],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('pipedirdemo');

//>>>>>>>>>>> Ex-1 >>>>>>>>>>>>>>>>>>
  //  inputText: string = '';

//>>>>>>>>>>> Ex-2 >>>>>>>>>>>>>>>>>>
  // selectedDate: string = '';


//>>>>>>>>>>> Ex-3 >>>>>>>>>>>>>>>>>>
  //  celsius: number = 0;


//>>>>>>>>>>> Ex-4 >>>>>>>>>>>>>>>>>>
   sampleText: string = 'This text will be highlighted and strikethrough';
}
