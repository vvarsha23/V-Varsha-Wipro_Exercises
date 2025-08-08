package com.wipro.LetsGohaving.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "vehicle_movement")
@Data
public class VehicleMovement {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long vehId;
    private Double lat;
    
    @Column(name = "longitude")
    private Double lng;

    private LocalDateTime timestamp = LocalDateTime.now();

}
