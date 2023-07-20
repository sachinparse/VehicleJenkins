package com.vehicle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehicleApplication implements CommandLineRunner {

	public static Logger logger = LoggerFactory.getLogger(VehicleApplication.class);
	
	public static void main(String[] args) {
		
		logger.info("It's a Continous Integration Job");
		SpringApplication.run(VehicleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("It's my testing logger.");
		
	}

	
}
