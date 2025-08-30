import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-success',
  standalone: true, 
  imports: [CommonModule,FormsModule],
  templateUrl: './success.html',
  styleUrl: './success.css'
})
export class Success {
  bookingId!: string;
  constructor(private route: ActivatedRoute) {
    this.bookingId = this.route.snapshot.params['bookingId'];
  }
  downloadPdf(){
    const blob = new Blob(['Booking ID: ${this.bookingId}\nStatus: Successful'], { type: 'application/pdf' });
    const url = window.URL.createObjectURL(blob);
    window.open(url);
  }

}
