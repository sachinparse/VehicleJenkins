package com.vehicle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//@Data
@Entity
@Table(name="vehicle")
public class Vehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String modelName;
	private int modelYear;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	
	
}
