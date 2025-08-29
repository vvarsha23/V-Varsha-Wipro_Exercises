package com.wipro.booking_ms.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.wipro.booking_ms.dto.BookingRequest;
import com.wipro.booking_ms.dto.BookingResponse;
import com.wipro.booking_ms.dto.FlightDTO;
import com.wipro.booking_ms.dto.SearchDTO;
import com.wipro.booking_ms.service.BookingService;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {
	private final BookingService bookingService;

    @PostMapping("/search")
    public List<FlightDTO> search(@RequestBody SearchDTO dto) {
        return bookingService.searchFlights(dto);
    }

    @PostMapping("/book")
    public BookingResponse book(@RequestBody BookingRequest request) {
        return bookingService.bookFlight(request);
    }

    @PostMapping("/update-status")
    public void updateStatus(@RequestParam Long bookingId, @RequestParam String status) {
        bookingService.updateStatus(bookingId, status);
    }

}
