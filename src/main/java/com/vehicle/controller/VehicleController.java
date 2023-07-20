package com.vehicle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.entity.Vehicle;
import com.vehicle.service.VehicleService;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping
	public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle){
		
		Vehicle savedVehicle = new Vehicle() ; //vehicleService.addVehicle(vehicle);
		savedVehicle.setId(101);
		savedVehicle.setModelName("Honda");
		savedVehicle.setModelYear(2020);
		
		return new ResponseEntity<>(savedVehicle, HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public Vehicle getVehicleById(@PathVariable("id") Long id){
		
		Vehicle vehicle = new Vehicle();
		vehicle.setId(101);
		vehicle.setModelName("Honda");
		vehicle.setModelYear(2020);
		
		return vehicle; //vehicleService.getVehicleById(id);
	}
	
	@GetMapping("/all")
	public List<Vehicle> getAllVehicles(){
		
		return new ArrayList<Vehicle>(); //vehicleService.getAllVehicles();
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable("id") Long id){
		
		//vehicleService.deleteById(id);
		return "Vehicle deleted successfuly";
	}
	
	
}
