package com.nit.sj.sbeans;

import org.springframework.stereotype.Component;

//@Component("pe")
public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine()");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("PetrolEngine.start()");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("PetrolEngine.stop()");

	}

}
