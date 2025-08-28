package com.wipro.letsgo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.letsgo.entity.Vehicle;
import com.wipro.letsgo.service.VehicleService;

@RestController
@RequestMapping("/move")
public class VehicleController {
	
	
	@Autowired
	VehicleService service;
	
	@PostMapping
    public ResponseEntity<Vehicle> saveMovement(@RequestBody Vehicle movement) {
        Vehicle saved = service.saveMovement(movement);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllMovements() {
        return ResponseEntity.ok(service.getAllMovements());
    }

}
