package com.nit.sj;

import java.time.LocalTime;

import com.nit.sj.sbeans.WIshMessageGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbProj02WishMessageGeneratorApplication {

	public SbProj02WishMessageGeneratorApplication() {
		System.out.println("SbProj02WishMessageGeneratorApplication.SbProj02WishMessageGeneratorApplication()");
	}

	@Bean(value = "lt")
	public LocalTime getLocalTime() {
		System.out.println("SbProj02WishMessageGeneratorApplication.getLocalTime()");
		return LocalTime.now();
	}

	public static void main(String[] args) {

		System.out.println("SbProj02WishMessageGeneratorApplication.main()");

		try (ConfigurableApplicationContext ctx = SpringApplication.run(SbProj02WishMessageGeneratorApplication.class,
				args);) {
			WIshMessageGenerator generator = ctx.getBean("wmg",WIshMessageGenerator.class);
			String message = generator.getWishmessage();
			System.out.println(message);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
