package com.wipro.LetsGohaving.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.LetsGohaving.model.VehicleMovement;
import com.wipro.LetsGohaving.repository.VehicleMovementRepository;

@RestController
public class MoveController {
	@Autowired
    private VehicleMovementRepository repository;

    @PostMapping("/move")
    public String move(@RequestBody VehicleMovement movement) {
        repository.save(movement);
        return "Movement saved!";
    }

}
