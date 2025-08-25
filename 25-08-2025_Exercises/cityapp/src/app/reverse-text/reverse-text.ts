import { CommonModule } from '@angular/common';
import { Component,OnInit,OnDestroy } from '@angular/core';
import { ReactiveFormsModule, FormControl } from '@angular/forms';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-reverse-text',
  standalone: true,
  imports: [CommonModule,ReactiveFormsModule],
  templateUrl: './reverse-text.html',
  styleUrl: './reverse-text.css'
})
export class ReverseText implements OnInit, OnDestroy{
  inputControl = new FormControl('');
  reversedText: string = '';

  private sub!: Subscription;

  ngOnInit(): void {
    this.sub = this.inputControl.valueChanges.subscribe(value => {
      this.reversedText = (value || '').split('').reverse().join('');
    });
  }

  ngOnDestroy(): void {
    this.sub.unsubscribe();
  }
  

}
