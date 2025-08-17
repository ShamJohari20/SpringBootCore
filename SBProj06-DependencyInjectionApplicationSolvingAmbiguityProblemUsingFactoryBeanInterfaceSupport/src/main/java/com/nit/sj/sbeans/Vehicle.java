package com.nit.sj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("veh")
public class Vehicle {
	@Autowired
//	@Qualifier("pe")
	private IEngine engine;

	public Vehicle() {
		System.out.println("Vehicle.Vehicle()");
	}
	
	public void journey(String sour, String dest) {
		System.out.println("Vehicle.gourney()");
		
		engine.start();
		System.out.println("Journey Started at " + sour);
		engine.stop();
		System.out.println("Journey Stop at " + dest);
	}

}
