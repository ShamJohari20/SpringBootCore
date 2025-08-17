package com.nit.sj.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nit.sj.sbeans.DiselEngine;
import com.nit.sj.sbeans.IEngine;
import com.nit.sj.sbeans.PetrolEngine;

@Component("ef")
public class EngineFactory implements FactoryBean<IEngine> {
	
	@Value("${engine}")
	private String engine;

	public EngineFactory() {
		// TODO Auto-generated constructor stub
		System.out.println("EngineFactory.EngineFactory()");
	}

	@Override
	public IEngine getObject() throws Exception {
		System.out.println("EngineFactory.getObject()");

		switch (engine) {
		case "disel":
			return new DiselEngine();
		case "petrol":
			return new PetrolEngine();
		default:
			throw new IllegalArgumentException("Invalid Engine Type");
		}
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return IEngine.class;
	}

}
