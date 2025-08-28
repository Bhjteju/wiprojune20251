package com.wipro.letsgo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.letsgo.entity.Vehicle;
import com.wipro.letsgo.repo.VehicleRepo;
import com.wipro.letsgo.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	VehicleRepo repo;
	
	@Override
    public Vehicle saveMovement(Vehicle movement) {
        return repo.save(movement);
    }

    @Override
    public List<Vehicle> getAllMovements() {
        return repo.findAll();
    }
}

