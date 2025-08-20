import { DatePipe, NgClass, UpperCasePipe } from '@angular/common';
import { Component} from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { CtofPipe } from './ctof-pipe';
import { Highlightstrikethru } from './highlightstrikethru';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormsModule,UpperCasePipe,DatePipe,CtofPipe,Highlightstrikethru],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  inputText: string = '';
  selectedDate:string = '';
  centigrade: string = '80';
}
