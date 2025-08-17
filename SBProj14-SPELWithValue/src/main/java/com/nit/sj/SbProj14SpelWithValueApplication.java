package com.nit.sj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sj.sbeans.Institude;

@SpringBootApplication
public class SbProj14SpelWithValueApplication {

	private final Institude institude;

	SbProj14SpelWithValueApplication(Institude institude) {
		this.institude = institude;
	}

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(SbProj14SpelWithValueApplication.class,
				args);) {
			Institude inst = ctx.getBean("institude", Institude.class);
			
			System.out.println(inst.idCard());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
