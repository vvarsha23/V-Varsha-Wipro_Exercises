package com.wipro.booking_ms.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequest {
	private String flightId;
    private String userEmail;
    private LocalDate travelDate;
    private double amount;
    private String mode; 

}
