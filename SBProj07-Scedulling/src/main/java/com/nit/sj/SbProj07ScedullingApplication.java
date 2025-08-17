package com.nit.sj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SbProj07ScedullingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbProj07ScedullingApplication.class, args);
		System.out.println("SbProj07ScedullingApplication.main()");
	}

}
