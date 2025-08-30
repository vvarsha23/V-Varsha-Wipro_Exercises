import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FlightDTO } from '../models/flight.dto';
import { Booking } from '../booking';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-search-results',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './search-results.html',
  styleUrl: './search-results.css'
})
export class SearchResults {
  flights: FlightDTO[] = [];
  constructor(private bookingService: Booking,private router: Router) {
    const search = history.state;
    if (search.source && search.destination && search.date) {
      bookingService.searchFlights(search).subscribe(data => this.flights = data);
    }
  }
  book(flightId: string){
    this.router.navigate(['/booking',flightId]);
  }

}
