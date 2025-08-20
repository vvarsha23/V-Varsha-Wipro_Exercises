import { Directive,ElementRef,Renderer2} from '@angular/core';

@Directive({
  selector: '[appHighlightstrikethru]',
  standalone: true
})
export class Highlightstrikethru{

  constructor(private el: ElementRef, private renderer: Renderer2) {
    this.renderer.setStyle(this.el.nativeElement, 'color', 'yellow');
    this.renderer.setStyle(this.el.nativeElement, 'text-decoration', 'line-through');
  }

}
