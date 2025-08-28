import { Directive, ElementRef, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appEx4Highlightstrikethru]'
})
export class Ex4Highlightstrikethru {

  constructor(private el: ElementRef) {

   const element = this.el.nativeElement as HTMLElement;

    element.style.display = 'inline';
    element.style.color = 'black';
    element.style.backgroundColor = 'yellow';
    element.style.textDecoration = 'line-through';
  }
}
