import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'ctof',
  standalone: true
})
export class CtofPipe implements PipeTransform {

  transform(value: number | string): string {
    const celsius = parseFloat(value as string);
    if (isNaN(celsius)) return '';
    const fahrenheit = (celsius * 9) / 5 + 32;
    return `${Math.round(fahrenheit)}F`; // rounding for cleaner output
  }

}
