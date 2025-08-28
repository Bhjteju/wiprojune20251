package com.wipro.letsgo.service;

import java.util.List;

import com.wipro.letsgo.entity.Vehicle;

public interface VehicleService {
	Vehicle saveMovement(Vehicle movement);
    List<Vehicle> getAllMovements();
}
