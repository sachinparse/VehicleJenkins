package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.vehicle.entity.Vehicle;

@Service
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
