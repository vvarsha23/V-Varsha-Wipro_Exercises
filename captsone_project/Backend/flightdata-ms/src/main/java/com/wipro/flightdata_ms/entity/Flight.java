package com.wipro.flightdata_ms.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
	@Id
    private String flightId;
    private String airline;
    private String source;
    private String destination;
    private LocalDate startDate;
    private LocalDate endDate;
    private double price;

}
