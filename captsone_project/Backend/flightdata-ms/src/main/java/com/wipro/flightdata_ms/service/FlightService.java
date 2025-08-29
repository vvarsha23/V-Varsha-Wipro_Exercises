package com.wipro.flightdata_ms.service;
import java.time.LocalDate;
import java.util.List;

import com.wipro.flightdata_ms.entity.Flight;
public interface FlightService {
	List<Flight> searchFlights(String source, String destination, LocalDate date);

}
