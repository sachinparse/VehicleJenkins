package com.vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VehicleApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(VehicleApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("It's a test class.");
		assertEquals(true, true);
	}

}
