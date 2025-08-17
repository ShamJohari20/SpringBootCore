package com.nit.sj.sbeans;

import org.springframework.stereotype.Component;

@Component("de")
public class DiselEngine implements IEngine {
	
	public DiselEngine() {
		System.out.println("DiselEngine.DiselEngine()");
	}

	@Override
	public void start() {
		System.out.println("DiselEngine.start()");
		
	}

	@Override
	public void stop() {
		System.out.println("DiselEngine.stop()");
	}

}
