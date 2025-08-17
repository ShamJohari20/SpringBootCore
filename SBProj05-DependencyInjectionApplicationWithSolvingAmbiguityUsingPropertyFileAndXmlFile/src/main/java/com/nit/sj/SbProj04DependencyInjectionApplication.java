package com.nit.sj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nit.sj.sbeans.IEngine;
import com.nit.sj.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nit/sj/config/ApplicationContext.xml")
public class SbProj04DependencyInjectionApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(SbProj04DependencyInjectionApplication.class, args);
	){
			System.out.println("SbProj04DependencyInjectionApplication.main()");
			
			Vehicle vehicle = ctx.getBean("veh",Vehicle.class);
			vehicle.journey("Khamgaon" , "Pune");
			
			}
		}

}
