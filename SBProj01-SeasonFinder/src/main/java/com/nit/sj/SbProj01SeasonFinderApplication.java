package com.nit.sj;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sj.sbeans.SeasonFInder;

@SpringBootApplication
public class SbProj01SeasonFinderApplication {
	
	@Bean(value="ld")
	public LocalDate getLocaldate() {
		return LocalDate.now();
	}
	
	public static void main(String[] args) {
		System.out.println("SbProj01SeasonFinderApplication.main()");
		try(ConfigurableApplicationContext ctx=SpringApplication.run(SbProj01SeasonFinderApplication.class, args);
	){
			SeasonFInder finder = ctx.getBean("sf",SeasonFInder.class);
			
			String season = finder.findSeason();
			System.out.println(season);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
