import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Booking } from '../booking';
import { BookingRequest } from '../models/booking-request.dto';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-bookingcomp',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './bookingcomp.html',
  styleUrl: './bookingcomp.css'
})
export class Bookingcomp {
  request: BookingRequest = {
    flightId: '',
    userEmail: '',
    travelDate: '',
    amount: 0,
    mode: ''
  };
  constructor(private route: ActivatedRoute,private bookingService: Booking,private router: Router) {
    this.request.flightId = this.route.snapshot.params['flightId'];
  }
  submitBooking() {
    this.bookingService.bookFlight(this.request).subscribe((res: any) => {
    const bookingId = res.bookingId;
    this.router.navigate(['/payment',bookingId]);  
  });
  }

}
