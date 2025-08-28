import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'ex3CelsiusToFahrenheit',
  standalone: true  
})
export class Ex3CelsiusToFahrenheitPipe implements PipeTransform {

  transform(value: number): string {
    if (value == null || isNaN(value)) {
      return '';
    }
    
    const fahrenheit = (value * 9/5) + 32;
    return `${fahrenheit}F`;
  }

}
