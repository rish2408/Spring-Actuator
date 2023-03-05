package com.actuator.service;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DBHealthChecker implements HealthIndicator{

	public static final String DB_SERVICE = "Database Service";
	
	public boolean isHealthGood()
	{
		// Custom logic for health
		return false;
	}
	
	@Override
	public Health health() {

		if(isHealthGood())
			return Health.up().withDetail(DB_SERVICE, "Database Service is Running").build();
		
		return Health.down().withDetail(DB_SERVICE, "Database Service is Down").build();
	}
	
}
