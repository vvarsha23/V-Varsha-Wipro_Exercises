import { CommonModule } from '@angular/common';
import { Component, Input ,Output,EventEmitter} from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Iex1Displaylist } from '../iex1-displaylist';

@Component({
  selector: 'app-ex1-displaylist',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './ex1-displaylist.html',
  styleUrl: './ex1-displaylist.css'
})
export class Ex1Displaylist {
  @Input() fruit!: Iex1Displaylist;
  @Output() remove = new EventEmitter<void>();
  removeItem() {
    this.remove.emit();
  }
  //fruits = [
  //  { name: 'Apple',
    //  description: 'A sweet red fruit',
      //image: 'https://upload.wikimedia.org/wikipedia/commons/1/15/Red_Apple.jpg' },
    //{ name: 'Banana',
     // description: 'A long yellow fruit',
   //   image: 'https://upload.wikimedia.org/wikipedia/commons/8/8a/Banana-Single.jpg' },
   // { name: 'Orange',
    //  description: 'A round orange fruit',
    //  image: 'https://upload.wikimedia.org/wikipedia/commons/c/c4/Orange-Fruit-Pieces.jpg'
   // }
//  ];

}
