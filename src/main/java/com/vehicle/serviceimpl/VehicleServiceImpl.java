package com.vehicle.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.entity.Vehicle;
import com.vehicle.repository.VehicleRepository;
import com.vehicle.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

	@Override
	public Vehicle getVehicleById(Long vehicleId) {
		return null;
	}

	@Override
	public List<Vehicle> getAllVehicles() {
		return null;
	}

	@Override
	public void deleteById(Long vehicleId) {
		vehicleRepository.deleteById(vehicleId);
	}
	

}
