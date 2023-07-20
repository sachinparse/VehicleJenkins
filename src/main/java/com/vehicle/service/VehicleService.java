package com.vehicle.service;

import java.util.List;

import com.vehicle.entity.Vehicle;

public interface VehicleService {

	Vehicle addVehicle(Vehicle vehicle);
	Vehicle getVehicleById(Long vehicleId);
	List<Vehicle> getAllVehicles();
	void deleteById(Long vehicleId);
}
