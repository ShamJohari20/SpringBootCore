package com.nit.sj;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sj.sbeans.WeekDayFinder;

@SpringBootApplication
public class SbProj03WeekDayFinderApplication {
	
	@Bean("ld")
	public LocalDate getLocalDate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		System.out.println("SbProj03WeekDayFinderApplication.main()");
		try(ConfigurableApplicationContext ctx = SpringApplication.run(SbProj03WeekDayFinderApplication.class, args);
	){
			WeekDayFinder finder = ctx.getBean("wdf",WeekDayFinder.class);
			finder.getWeekDay();
			
		}
	}

}
